//� A+ Computer Science  -  www.apluscompsci.com

//printing out a set with the new for loop  

import java.util.Set;
import java.util.TreeSet;

public class SetOutputNew
{
	public static void main(String args[])
	{
		Set<Double> doubleSet = new TreeSet<Double>();
		doubleSet.add(2.5);
		doubleSet.add(5.8);
		doubleSet.add(7.3);
		doubleSet.add(2.0);
		doubleSet.add(7.6);
		doubleSet.add(7.3);

		//add a for each loop to print out all of the values in the set
		
		for(Double x : doubleSet)
		{
			System.out.println(x + " hashcode " + x.hashCode());
		}
		
	}
}