import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;

	InputFromConsoleClass() {
		scanner = new Scanner(System.in);
	}

	public ExchangeType inputAll () {
		ExchangeType ex = new ExchangeType();
//		ex.w = inputWon();
//		ex.type = inputType();
		
		return ex;
	}
	protected void finalize() {
		scanner.close();
	}

	public double inputWon() {
		double w;
		System.out.print("*받은 원화 입력 : ");
		w = scanner.nextInt();
		return w;
	}

	public int inputType() {
		int type;
		System.out.print("환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) ? ");
		type = scanner.nextInt();
		return type;
	}
}
