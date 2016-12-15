//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SWCNode
{
	// private instance data
	private String name;
	private SWCNode prev;
	private SWCNode next;
	
	// constructor
	public SWCNode()
	{
		
	}
	public SWCNode(String s)
	{
		name = s;
		prev = next = null;
	}
	
	// set Methods
	public void setPrev(SWCNode p)
	{
		prev = p;
	}
	public void setNext(SWCNode n)
	{
		next = n;
	}
	
	// get Methods
	public String getName()
	{
		return name;
	}
	public SWCNode getPrev()
	{
		return prev;
	}
	public SWCNode getNext()
	{
		return next;
	}	

	
}