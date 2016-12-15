
public class EnumEx {

	public static void main(String[] args) 
	{
		Currency [] coins = {Currency.QUARTER, Currency.DIME,
							Currency.DIME, Currency.PENNY};
	
		int value=0;		// value of all coins
		for (Currency myCoin : coins)
			value += myCoin.getValue();
		
		System.out.println("Total = " + value);
		System.out.printf("%,+06.2f%n",2345.789); 	//Line 11	_______________

		double v = 19.541; 
		System.out.printf("%,-12.2fx%n", 2345.788); 	//Line 12	_______________

		System.out.printf("%,+05.3f%n",45.789899); 	//Line 13
		
		
}	}

