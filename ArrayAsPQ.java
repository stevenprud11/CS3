import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

//Name -
//Date -
//Class -
//Lab  -

public class ArrayAsPQ
{
	// instance data
	private int[] nums;
	private int size;

	// constructors
	public ArrayAsPQ()
	{
		nums = new int[25];
	}
	
	public ArrayAsPQ(int a)
	{
		nums = new int[a];

	}
	// return methods
	public int peek()
	{
		//reheapUp();
		return nums[0];
	}

	// helper methods
	
	public void enqueue(int a)
	{
		
		nums[size] = a;
		reheapUp();
		size++;
		//System.out.println(Arrays.toString(nums));
	}

	public int dequeque()
	{
		int hold = peek();
		nums[0] = 0;
		
		reheapDown();
		
		return hold;
	}
	//private methods
	private void reheapUp()
	{
			int bot = size;
			while( bot>0 )
			{
				int parent = (bot-1)/2;
				if (nums[parent] > nums[bot])
				{
					int hold = nums[parent];
					nums[parent]=nums[bot];
					nums[bot] = hold;
				}
				
					bot--;
			}
	}
	private void reheapDown()
	{
		nums[0] = nums[size-1];
		nums[size-1]=0;
		int root=0;
		int min=0;
		int i =0;
		int parent = root;
		while(i<size-1)
		{
			//System.out.println(i);
			int left = (parent*2)+1;
			int right = (parent*2)+2;
			if (nums[left]!=0 && nums[right]!=0)
			{
				if(nums[left]<nums[right])
				{
					min = left;

				}
				else 
				{
					min = right;

				}
			}

			if(nums[min] < nums[parent])
			{
				int hold = nums[parent];
				nums[parent] = nums[min];
				nums[min] = hold;
				parent = min;
			}
			i++;
			//System.out.println(root);
		}
		size--;
		//reheapUp();
	}
	
	// toString
	public String toString()
	{
		return Arrays.toString(nums);
	}





}