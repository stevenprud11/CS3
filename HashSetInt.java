//� A+ Computer Science
// www.apluscompsci.com

//hash set int example  

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInt
{
	public static void main(String args[])
	{
		Set<Integer> intSet;
		intSet = new HashSet<Integer>();		// HashSet of Integers
		intSet.add(45);
		intSet.add(12);
		System.out.println(intSet.add(12));		// try adding another 12
		intSet.add(23);
		System.out.println(intSet);
		
		// Add more to the set
		intSet.add(2);
		intSet.add(234);
		intSet.add(31);
		System.out.println(intSet);		// print out in iterator order
		
		// iterate over the set using the iterator
		Iterator<Integer> it = intSet.iterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			System.out.println(x + " " + x.hashCode());
		}
		// now print the hashCode for each item
		
		
	}
}