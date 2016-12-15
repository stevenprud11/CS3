//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	private static Set<String> uniques;
	private static Queue<String> q;
	public static Set<String> getUniques(String input)
	{
		uniques = new TreeSet<String>();
		q = new LinkedList<String>();
		
		
		String[] arr = input.split(" ");
		//add code
		for(int i=0; i<arr.length;i++)
		{
			uniques.add(arr[i]);
			q.add(arr[i]);
			

		}

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		
		String[] arr = input.split(" ");
		//add code
		for(int i=0; i<arr.length;i++)
		{
			if(Collections.frequency(q, arr[i]) > 1)
			{
				dupes.add(arr[i]);
			}
		}

		return dupes;
	}
}