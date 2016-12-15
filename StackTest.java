//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		setStack("");
	}
	public StackTest(String line)
	{
		stack = new Stack();
		String[] arr = line.split(" ");
		for(int i =0; i<arr.length; i++)
		{
			stack.add(arr[i]);
		}
	}
	
	public void setStack(String line)
	{
		String[] arr = line.split(" ");
		for(int i =0; i<arr.length; i++)
		{
			stack.add(arr[i]);
		}
	}

	public void popEmAll()
	{
		System.out.println(stack);
		System.out.println("Printing out the stack...");
		while(!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println("\n");
	}

	//add a toString
}