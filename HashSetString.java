//� A+ Computer Science
// www.apluscompsci.com

//hash set string example  

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetString
{
	public static void main(String args[])
	{
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("AB");
		stringSet.add("23");
		stringSet.add("ab");
		System.out.println(stringSet);
		
		// add more to the set
		
		//System.out.println(stringSet);		// print out in iterator order
		
		// iterate over the set using the iterator
		Iterator<String> it = stringSet.iterator();
		
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s + " hashcode " + s.hashCode());
		}
		System.out.println("hashcode for set = " + stringSet.hashCode());
		
		// now print the hashCode for each item
	}
}