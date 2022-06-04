package util;

public class CurrencyConverter {

	static double total;
	static final double IOF = 0.06;
	
	public static double convert (double compra, double dollar) {
		total = compra * dollar;
		return  compra * dollar * IOF + total;
	}
}
