//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private PriorityQueue<String> pQue;
	private String[] hold;
	
	public PQTester()
	{
		pQue = new PriorityQueue<String>();
	}

	public PQTester(String list)
	{
		pQue = new PriorityQueue<String>();
		hold = list.split(" ");
		for(int i =0; i<hold.length;i++)
		{
			pQue.add(hold[i]);
		}
	}

	public void setPQ(String list)
	{
		hold = list.split(" ");
		for(int i =0; i<hold.length;i++)
		{
			pQue.add(hold[i]);
		}
	}
	
	public String getMin()
	{
		for(int i =0; i<hold.length;i++)
		{
			pQue.add(hold[i]);
		}
		return pQue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQue.isEmpty())
		{
			output+=pQue.poll() + " ";
		}
		
		return output;		
	}

	public String toString()
	{
		return getNaturalOrder();
	}
	//write a toString method
}