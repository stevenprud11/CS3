import java.util.Arrays;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class ArrayAsPQRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		ArrayAsPQ pq1 = new ArrayAsPQ(25);

		//add items to the PQ
		pq1.enqueue(15);
		pq1.enqueue(23);
		pq1.enqueue(5);
		pq1.enqueue(2);
		pq1.enqueue(29);
		pq1.enqueue(17);
		pq1.enqueue(32);
		pq1.enqueue(25);
		pq1.enqueue(2);

		// print all items in the priority queue (no ordering)
		System.out.println(pq1);
		
		System.out.println(pq1.dequeque());
		System.out.println(pq1);
		

		// print all items in PQ in priority order (list will be empty when finished)


	}
}