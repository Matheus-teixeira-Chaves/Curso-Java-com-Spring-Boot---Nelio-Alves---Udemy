package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCasaCambio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double compra = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convert(compra, dollar));
		
		scan.close();

	}

}
