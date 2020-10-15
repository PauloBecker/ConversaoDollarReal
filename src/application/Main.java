package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = tc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double howManyDollar = tc.nextDouble();
		double result = CurrencyConverter.amountPaidReais(dollarPrice, howManyDollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		tc.close();
	}

}
