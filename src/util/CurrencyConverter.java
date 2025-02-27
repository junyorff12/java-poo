package util;

public class CurrencyConverter {

	public static final double TAX = 0.06;

	public static double dollarToRealCalculator(double dollarPrice, double dollarAmount) {
		var valueWhitoutTax = dollarPrice * dollarAmount;
		var taxAmout = valueWhitoutTax * TAX;
		return valueWhitoutTax + taxAmout;
		
	}
}
