
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Words {

	public static void main(String[] args) throws FileNotFoundException 
	{
		try
		{
			// TODO Auto-generated method stub
			Scanner file = new Scanner(new File ("words.dat"));
	
			int lines = file.nextInt();
			file.nextLine();
			String s ="";
			String[] s1;
			for(int k = 0; k<=lines;k++)
			{
				s  = file.nextLine();
				 s1 = s.split(" ");
				 System.out.print(s1[0]);
				for (int g = 1 ; g<s1.length; g++)
				{
					System.out.print(" " + s1[g].charAt(0));
				}
				System.out.println();
			}
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
			//e.printStackTrace();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}






	}

}
