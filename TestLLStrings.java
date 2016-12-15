import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/** Name
 *	Course
 *	Data
 */




public class TestLLStrings
{
	private LinkedList<String> list;
	
	
	
	public TestLLStrings()
	{
		list = new LinkedList<String>();
	}
	public TestLLStrings(String s)
	{
		list = new LinkedList<String>();
		list.add(s);
	}
	
	public void addName(String s)
	{
		list.add(s);
	}
	public void addAt(String s, int n)
	{
		list.add(n, s);
		if(s.equals("BB-8"))
		{
			System.out.println("BB-8 was added in the correct spot");
		}
	}
	public ArrayList<String> searchFor(String s)
	{
		ArrayList names = new ArrayList<String>();
		
		for(int i =0; i<list.size(); i++)
		{
			String n = list.get(i);
			if(n.contains("Darth"))
				names.add(n);
		}
		
		
		return names;
	}
	
	
	public String toString()
	{
		Collections.sort(list);
		
		return list + "";
	}
	
	public static void main (String [] args) throws FileNotFoundException
	{
		TestLLStrings test = new TestLLStrings();
		Scanner kb = new Scanner(new File("StarWarsCharacters.txt"));
		while(kb.hasNextLine())
		{
			test.addName(kb.nextLine());
		}
		
		
		test.addName("Kylo Ren");
		test.addName("Ray");
		test.addName("Poe Dameron");
		test.addName("Finn");
		test.addAt("BB-8", 0);
		
		System.out.println("\nUnsorted List\n" + test);
		System.out.println("\nSearching for names containing 'Darth'\n" + test.searchFor("Darth"));
		System.out.println("\nSorted List\n" + test);

		
		
	}
}