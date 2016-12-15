//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
		Scanner kb = new Scanner(new File("mathsetdata.dat"));
		while(kb.hasNextLine())
		{
			String one = kb.nextLine();
			String two = kb.nextLine();
			MathSet test = new MathSet(one, two);
			System.out.println("Set One [" + one + "]");
			System.out.println("Set Two [" + two + "]\n");
			
			System.out.println("Union " + test.union());
			System.out.println("Intersection " + test.intersection());
			System.out.println("A-B " + test.differenceAMinusB());
			System.out.println("B-A " + test.differenceBMinusA());
			System.out.println("Symmetric Difference " + test.symmetricDifference());

			
			System.out.println();
			
		}
		
		
	}
}
