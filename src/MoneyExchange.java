import java.io.IOException;

public class MoneyExchange {
	public static void main(String[] args) throws IOException {
//		double w;
//		double cw = 0;
//		int type = 0;
//		int returnwon = 0;
//		String exchange_type = "0";
		
		ExchangeType exType;
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriteClass fwc = new FileWriteClass();

		fwc.headerWrite();

		do {
			exType = new ExchangeType();
			exType.w = inputConsole.inputWon();
			exType.type = inputConsole.inputType();

			if (exType.type == ConstValueClass.EX_TYPE_USD) {
				exType.cw = pc.exchangeUSD(exType.w);
				exType.exchange_type = "USD";
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) {
				exType.cw = pc.exchangeEUR(exType.w);
				exType.exchange_type = "USD";
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY) {
				exType.cw = pc.exchangeJPY(exType.w);
				exType.exchange_type = "JPY";
			}
			
			exType.returnwon = pc.returnWon(exType.cw);
			
			fwc.dataWrite(exType);

		} while (exType.type != ConstValueClass.EX_TYPE_EXIT);
		fwc.fileClose();
	}

}























