//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;
	private String[] list1;

	public IteratorRemover(String line, String rem)
	{
		list = new ArrayList();
		toRemove = rem;
		list1 = line.split(" ");
		
		for(String s: list1)
		{
			list.add(s);
		}
		remove();
	}

	public void setTest(String line, String rem)
	{
		toRemove = rem;
		String[] list1 = line.split(" ");
		
		for(String s: list1)
		{
			list.add(s);
		}
		//remove();
	}

	public void remove()
	{
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(toRemove))
			{
				it.remove();
			}
		}
		
	}

	public String toString()
	{
		return "Original list " + Arrays.toString(list1) + " \nLetter to Remove, " + toRemove + " \nNew List :: " + list + "\n" ;
	}
}