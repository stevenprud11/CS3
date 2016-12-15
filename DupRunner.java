//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		UniquesDupes test = new UniquesDupes();
		
		System.out.println("Original List\na b c d e f g h a b c d e f g h i j k");
		System.out.println("Unique List \n" + test.getUniques("a b c d e f g h a b c d e f g h i j k"));
		System.out.println("Duplicates List \n" +test.getDupes("a b c d e f g h a b c d e f g h i j k"));
		System.out.println();
		
		
		System.out.println("Original List\none two three one two three six seven one two");
		System.out.println("Unique List \n" + test.getUniques("one two three one two three six seven one two"));
		System.out.println("Duplicates List \n" +test.getDupes("one two three one two three six seven one two"));
		System.out.println();
		
		System.out.println("Original List\n1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Unique List \n" + test.getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		System.out.println("Duplicates List \n" +test.getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		System.out.println();

	}
}