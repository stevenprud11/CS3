//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		listOfInts = new ArrayList();
	}

	public void push(int item)
	{

			listOfInts.add(item);

	}

	public int pop()
	{
		int a = listOfInts.get(listOfInts.size()-1);
		listOfInts.remove(listOfInts.size()-1);
		return a;
	}

	public boolean isEmpty()
	{
		if(listOfInts.size()==0)
		return true;
		else
		return false;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		return listOfInts + "";
	}
}