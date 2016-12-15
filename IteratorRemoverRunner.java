//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		
		IteratorRemover test = new IteratorRemover("a b c a b c a", "a");
		IteratorRemover test1 = new IteratorRemover("a b c d e f j h i x x x x", "x");
		IteratorRemover test2 = new IteratorRemover("1 2 3 4 5 6 a b c a b c", "b");
		
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);

	}
}