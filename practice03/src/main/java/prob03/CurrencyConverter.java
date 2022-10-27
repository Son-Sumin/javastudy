package prob03;

//import java.math.BigDecimal;

public class CurrencyConverter {
	private static double rate;


	public static double toDollar(double won) {
//		BigDecimal W = new BigDecimal(won);
//		BigDecimal R = new BigDecimal(rate);
//		return W.divide(R, 1, BigDecimal.ROUND_DOWN);
		
		return won / rate;
		
	}

	public static double toKRW(double dollar) {
//		BigDecimal D = new BigDecimal(dollar);
//		BigDecimal R = new BigDecimal(rate);
//		return D.multiply(R);
		
		return (float)(dollar * rate);
	}

	public static void setRate(double r) {
		CurrencyConverter.rate = r;
	}

}
