//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;
	private int[] a1;
	private int[] b1;
	
	
	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		String [] a = o.split(" ");
		a1 = new int[a.length];
		String [] b = t.split(" ");
		b1 = new int[b.length];
		
		for(int i=0; i<a.length;i++)
		{
			a1[i] = Integer.parseInt(a[i]);
			one.add(a1[i]);
		}
		for(int i=0; i<b.length;i++)
		{
			b1[i] = Integer.parseInt(b[i]);
			two.add(b1[i]);
		}
		
	}

	public Set<Integer> union()
	{
		Set<Integer> un = new TreeSet<Integer>();
		un.addAll(one);
		un.addAll(two);
		
		
		return un;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> hold = new TreeSet<Integer>(one);
		hold.retainAll(two);
		
		return hold;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> hold = new TreeSet<Integer>(one);
		
		hold.removeAll(two);
		
		
		return hold;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> hold = new TreeSet<Integer>(two);
		
		hold.removeAll(one);
		
		
		return hold;
	}
	
	public Set<Integer> symmetricDifference()
	{	
		Set<Integer> inter = intersection();
		Set<Integer> nums = new TreeSet(one);
		nums.addAll(two);
		nums.removeAll(inter);
		
		
		return nums;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}