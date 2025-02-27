package exercises;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class TesteCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		var dollarPrice = sc.nextDouble();

		System.out.print("How many dollar will be bought? ");
		var dollarQuantity = sc.nextDouble();

		System.out.printf(
				"Amount to be paid in Reais: %.2f%n" , CurrencyConverter.dollarToRealCalculator(dollarPrice, dollarQuantity));
		
		sc.close();

	}

}
