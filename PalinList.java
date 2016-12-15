//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private String a;
	
	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		a=list;
		String[] s = list.split(" ");
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		
		for(int i =0; i<s.length; i++)
		{
			stack.add(s[i]);
			queue.add(s[i]);
		}
		
	}

	public void setList(String list)
	{
		String[] s = list.split(" ");
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		
		for(int i =0; i<s.length; i++)
		{
			stack.add(s[i]);
			queue.add(s[i]);
		}
	}

	public boolean isPalin()
	{
		while(!stack.isEmpty())
		{
			if(!stack.pop().equals(queue.poll()))
			{
				return false;
			}
		}
		return true;
	}


	//write a toString method
	
	public String toString()
	{
		return "is [" + a + "] a palindrom? \n" + isPalin();
	}
	
	
}