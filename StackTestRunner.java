//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		StackTest test = new StackTest("a b c d e f g h i");
		test.popEmAll();
		test = new StackTest("1 2 3 4 5 6 7 8 9 10");
		test.popEmAll();
		test = new StackTest("# $ % ^ * ( ) ) _");
		test.popEmAll();
	}
}
