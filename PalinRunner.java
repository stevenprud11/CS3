import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class PalinRunner
{
	public static void main ( String[] args ) throws FileNotFoundException
	{
		Scanner kb = new Scanner(new File("palinlist.dat"));
		
		while(kb.hasNextLine())
		{
			
			PalinList test = new PalinList(kb.nextLine());
			System.out.println(test);
		}
		
		//add test cases
	}
}