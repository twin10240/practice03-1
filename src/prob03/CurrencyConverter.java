package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double d) {
		rate = d;
	}

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKRW(double dollor) {
		return dollor * rate;
	}
}
