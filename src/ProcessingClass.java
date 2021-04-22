
public class ProcessingClass {
	OutputClass outClass = null;

	ProcessingClass() {
		outClass = new OutputClass();
	}

	public int returnWon(double cw) {
		int cwResult;
		cwResult = (int) cw;
		int won10000, won5000, returnWon;
		int won1000, won500, won100, won10;

		returnWon = (int) (cw / 10) * 10;
		won10000 = cwResult / 10000;
		won5000 = cwResult / 5000;
		won1000 = cwResult / 1000;
		won500 = cwResult % 1000 / 500;
		won100 = cwResult % 500 / 100;
		won10 = cwResult % 100 / 10;

		outClass.printWon(cw, returnWon, won10000, won5000, won1000, won500, won100, won10);
		
		return returnWon;
	}

	public double exchangeUSD(double w) {
		double exchangeResult;
		double ex_rate;
		int usd;
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		double cw = 0;
		ex_rate = ConstValueClass.EX_RATE_USD;
		exchangeResult = w / ex_rate;

		usd = (int) exchangeResult;
		usd100 = usd / 100;
		usd50 = usd % 100 / 50;
		usd20 = usd % 100 % 50 / 20;
		usd10 = usd % 100 % 50 % 20 / 10;
		usd5 = usd % 100 % 50 % 20 % 10 / 5;
		usd2 = usd % 100 % 50 % 20 % 10 % 5 / 2;
		usd1 = usd % 100 % 50 % 20 % 10 % 5 % 2 / 1;
		
		cw = w - usd * ex_rate;

		outClass.printUSD(exchangeResult, usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
		return cw;
	}

	public double exchangeEUR(double w) {
		double exchangeResult;
		double ex_rate;
		int eur, eur100, eur50, eur20, eur10, eur5;
		double cw = 0;
		ex_rate = ConstValueClass.EX_RATE_EUR;
		exchangeResult = w / ex_rate;
		
		eur = (int) exchangeResult;
		eur100 = eur / 100;
		eur50 = eur % 100 / 50;
		eur20 = eur % 100 % 50 / 20;
		eur10 = eur % 100 % 50 % 20 / 10;
		eur5 = eur % 100 % 50 % 20 % 10 / 5;
		
		cw = w - eur * ex_rate;
		
		outClass.printEURO(exchangeResult, eur, eur100, eur50, eur20, eur10, eur5);
		return cw;
	}

	public double exchangeJPY(double w) {
		double exchangeResult;
		double ex_rate;
		int jpy, jpy10000, jpy5000, jpy2000, jpy1000;
		double cw = 0;
		ex_rate = ConstValueClass.EX_RATE_JPY * 100;
		exchangeResult = w / ex_rate;

		jpy = (int) exchangeResult;
		jpy10000 = jpy / 10000;
		jpy5000 = jpy % 10000 / 5000;
		jpy2000 = jpy % 10000 % 5000 / 2000;
		jpy1000 = jpy % 10000 % 5000 % 2000 / 1000;
		
		cw = w - jpy * ex_rate;
		
		outClass.printJPY(exchangeResult, jpy, jpy10000, jpy5000, jpy2000, jpy1000);
		return cw;
	}
}
