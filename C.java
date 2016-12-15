import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner file = new Scanner(new File("C.txt"));
		ArrayList <Integer> origList, transList;
		
		while(file.hasNextLine())
		{
			String line1 = file.nextLine();
			String line2 = file.nextLine();
			origList = new ArrayList<Integer>();
			transList = new ArrayList<Integer>();
			
			Scanner data = new Scanner(line1);
			Scanner data2 = new Scanner(line2);
			int origLen = data.nextInt();
			int newLen = data2.nextInt();
			if(origLen!= newLen)
			{
				System.out.println("no");
				continue;
			}
			
			buildList(origList, data);
			buildList(transList, data2);
				//double distance = Math.sqrt((x1-x2)(x1-x2) + (y1-y2)(y1-y2));
			
			int oL=0;
			int countTimes=0;
			while(!(origList.equals(transList)) && countTimes < origList.size())
			{
				transList.add(transList.remove(0));
				countTimes++;
			}
			if(origList.equals(transList))
			{
				System.out.println("Yes");
				continue;
			}
			if(countTimes==origList.size())
			{
				System.out.println("no");
				continue;
			}
			
				
			
		}
		

	}
	public static void buildList(ArrayList<Integer> a, Scanner s)
	{
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int firstX = x1, firstY = y1;
		
		while(s.hasNextInt())
		{
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			
			double x = Math.pow(x1-x2,2)+ Math.pow(y1-y2,2);
			int distance = (int)Math.round((Math.sqrt(x)));
			
			
			a.add(distance);
			
			
			
			x1 = x2;
			y1 = y2;
		}
		double x = Math.pow(x1-firstX, 2) + Math.pow(y1 -firstY,2);
		int distance = (int) Math.round((Math.sqrt(x)));
		a.add(distance);
	}

}
