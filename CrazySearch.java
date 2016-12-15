import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crazy Search
 *
 */

public class CrazySearch
{
	private int num;
	private String s;
	private String output;
	private int total;
	private Set<String> words;
	
	public CrazySearch(int a, String str)
	{
		num = a;
		s=str;
		words = new TreeSet<String>();
		
	}
	
	public int countWords()
	{
		total =0;
		
		for(int i=0; i<s.length()-num+1;i++)
		{
			
			if(s.substring(i, i+num).length()==num && words.add(s.substring(i, i+num)))
				total++;
				
		}
		
		
		
		
		return total;
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner kb = new Scanner(new File("C.txt"));
		int size = kb.nextInt();
		kb.nextLine();
		int i=0;
		while(i<size)
		{
			String[] arr = kb.nextLine().split(" ");
			int length = Integer.parseInt(arr[0]);
			
			CrazySearch test = new CrazySearch(length, arr[1]);
			System.out.println(test.countWords());
			
			i++;
		}
		
	}

}