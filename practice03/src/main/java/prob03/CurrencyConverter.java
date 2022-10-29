package prob03;

//import java.math.BigDecimal;

public class CurrencyConverter {
	private static double rate;


	public static double toDollar(double won) {
		return won / rate;
		
	}

	public static double toKRW(double dollar) {
		return (float)(dollar * rate);
	}

	public static void setRate(double r) {
		CurrencyConverter.rate = r;
	}

}
