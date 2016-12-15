import java.util.Collection;

/*
 *ListDIY -- holds a doubly-linked list.
 *
 */

public class SortedLL
{
	// instance data
	private SWCNode head;
	private SWCNode tail;
	int size;

	// constructor
   	public SortedLL()
   	{
   		size=0;
   		head = tail = null;
   	}
   
   	
   	
   	public int add(SWCNode n)
   	{
   		SWCNode past, future;
   		int count = 0;
   		if(size==0)		//node goes at head
   		{
   			head = n;
   			size++;
   			return size-1; //index
   		}
   		
   		future = head;
   		past = null;
   		count=0;
   		while(future != null && n.getName().compareTo(future.getName())>=0)
   		{
   			past = future;
   			future = future.getNext();
   			count++;
   		}
   		if(future == null) // node goes at the end
   		{
   			tail = n;
   			past.setNext(n);
   			n.setPrev(past);
   			size++;
   			return size-1;
   		}
   		
   				
   		if(count == 0)  // before the first node
   		{
   			head=n;
   			n.setNext(future);
   			size++;
   			return 0;
   		}
   		// inserting between 2 nodes
   		past.setNext(n);
   		future.setPrev(n);
   		n.setNext(future);
   		n.setPrev(past);
   		size++;
   		
   		return count;
   	
   	
   	}
   	public String removeFirst(String n)
   	{
   		SWCNode past = null;
   		SWCNode current = head;
   		SWCNode future = head.getNext();
   		
   		//the first one
			if(head.getName().equals(n))
			{	
				String s = current.getName();
				head = future;
				future.setPrev(null);
				size--;
				return s;
			}
		return null;	
			
   	}
   	public String removeLast(String n)
   	{
   		SWCNode past = null;
   		SWCNode current = head;
   		SWCNode future = head.getNext();
   		
   		for(int i =0; i<size-1; i++)
		{
			if(i!=0)
			{
				past = current;
				current = future;
				future = future.getNext();
			}
			if(future.getName().equals(n))
			{
				
				String s = future.getName();
				past.setNext(future);
				future.setPrev(past);
				tail = future;
				size--;
				
				return s;
			}


		}
			
		return null;

   	}
   	public String remove(String n)
   	{
   		SWCNode past = null;
		SWCNode current = head;
		SWCNode future = head.getNext();
		
		
		for(int i =0; i<size; i++)
		{
			if(i!=0)
			{
				past = current;
				current = future;
				future = future.getNext();
			}
			if(current.getName().equals(n))
			{
				String s = current.getName();
				past.setNext(future);
				future.setPrev(past);

				size--;
				
				return s;
			}


		}
		

   		return null;
   	}
   	public int indexOf(String s)
   	{
   		SWCNode past = null;
   		SWCNode current = head;
   		SWCNode future = head.getNext();
   		
   		for(int i =0; i<size;i++)
   		{

   			if(current.getName().equals(s))
   				return i;

   			past=current;
   			current = future;
   			future = future.getNext();
   			
   		}
   		return -1;
   	}
   	public String get(int a)
   	{
   		SWCNode returner = null;
   		SWCNode current = head;
   		int i=0;
   		if(a==0)
   		{
   			return head.getName();			
   		}
   		if(a==size-1)
   		{
   			return tail.getName();
   		}
   		while(i<a)
   		{
   			current = current.getNext();
   			returner = current;
   			
   			i++;
   		}
   		return returner.getName();
   	}
   	public SWCNode peekFirst()
   	{
   		return head;
   	}
   	public SWCNode peekLast()
   	{
   		return tail;
   	}
   	
   	public String toString()
   	{
   		String s = "[";
   		SWCNode current = head;
   		for(int i =0; i<size; i++)
   		{
   			s+= current.getName() + ", ";
   			current = current.getNext();
   		}
   		return s + "";
   	}

	// methods
   	
   	
   	
   	
   	
   	
   	
}