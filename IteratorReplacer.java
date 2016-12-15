//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;
	private String[] list1;

	public IteratorReplacer(String line, String rem, String rep)
	{
		list = new ArrayList();
		toRemove = rem;
		replaceWith = rep;
		list1 = line.split(" ");
		
		for(String s: list1)
		{
			list.add(s);
		}
		replace();
	}

	public void setEmAll(String line, String rem, String rep)
	{
		list = new ArrayList();
		toRemove = rem;
		replaceWith = rep;
		list1 = line.split(" ");
		
		for(String s: list1)
		{
			list.add(s);
		}
		//replace();
	}

	public void replace()
	{
		ListIterator<String> it = list.listIterator();
		while(it.hasNext())
		{
			if(it.next().equals(toRemove))
			{
				it.set(replaceWith);
			}
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}