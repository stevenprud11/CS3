//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class PQTesterRunner

{
	public static void main ( String[] args )
	{
		//add test cases
		PQTester test = new PQTester("one two three four five six seven");
		System.out.println(test);
		System.out.println(test.getMin());
		System.out.println(test.getNaturalOrder());
		System.out.println("");
		
		test = new PQTester("1 2 3 4 5 one two three four five");
		System.out.println(test);
		System.out.println(test.getMin());
		System.out.println(test.getNaturalOrder());
		System.out.println("");
		
		test = new PQTester("a p h j e f m c i d k l g n o b");
		System.out.println(test);
		System.out.println(test.getMin());
		System.out.println(test.getNaturalOrder());
		System.out.println("");
		
	}
}