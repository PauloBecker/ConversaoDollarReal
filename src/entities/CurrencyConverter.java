package entities;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double amountPaidReais(double dollarPrice , double howManyDollar) {
		
		return howManyDollar * dollarPrice*(1.0 + iof);
	}

	
	
}
