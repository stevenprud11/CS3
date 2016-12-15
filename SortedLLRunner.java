//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SortedLLRunner
{
	public static void main ( String[] args ) throws FileNotFoundException
	{
		SortedLL z = new SortedLL();
		
		
//		z.add(new SWCNode("4-LOM"));
//		z.add(new SWCNode("ARC Troopers"));
//		z.add(new SWCNode("AT-ST"));
//		z.add(new SWCNode("Aayla Secura"));
//		out.println("Removing ARC Troopers = " + z.remove(z.peekLast().getName()));
		
		Scanner file = new Scanner(new File("StarWarsCharacters.txt"));

		// Read in the file here
		while (file.hasNextLine())
			z.add(new SWCNode(file.nextLine()));

		out.println("Original list values");
		out.println(z);

		out.print("Getting the first three in the list::\t");
		out.print(z.get(0) + "\t");
		out.print(z.get(1) + "\t");
		out.println(z.get(2));


		out.println("Size of Sorted List = " + z.size);

		out.println("First One = " + z.peekFirst().getName());
		out.println("Last One = " + z.peekLast().getName());

		out.println("Removing ARC Troopers = " + z.remove("ARC Troopers"));
		out.println("Removing first One = " + z.removeFirst(z.peekFirst().getName()));
		out.println("Removing last One = " + z.removeLast(z.peekLast().getName()));
		out.println(z);

		out.println("Index of first one (should be 0) = "+ z.indexOf(z.get(0)));
		out.println("Index of last one (should be 211) = "+ z.indexOf(z.get(z.size-1)));

	}
}