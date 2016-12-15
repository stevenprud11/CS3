//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		
		IteratorReplacer test = new IteratorReplacer("a b c a b c a", "a", "+");
		IteratorReplacer test1 = new IteratorReplacer("a b c d e f j h i x x x x", "x", "7");
		IteratorReplacer test2 = new IteratorReplacer("1 2 3 4 5 6 a b c a b c", "b", " #");
		
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);
	}
}