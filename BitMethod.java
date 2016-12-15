import java.util.Arrays;

public class BitMethod {

	
	public static String bitString(int num)
	{
		int temp = num;
		String str="";
		
		while(temp>0)
		{
			str= (temp & 1) + str;
			temp>>=1;
		}
		return str;
		
		
	}
	
	public static int countBitSet(int num)
	{
		int total =0;
		while(num!=0)
		{
			num>>=1;
			total++;
		}
		return total;
	}
	
	public static byte[] countBitLong(long num)
	{
		byte[] test = new byte[8];
		
		for(int i =0; i<7; i++)
		{
			test[i] =(byte) (num & 01111111);
			
			num>>=8;
		}
		return test;
		
		
	}
	
	public static byte[] flipBitsInChar(long num)
	{
		byte[] test = new byte[8];
		
		for(int i =7; i>-1; i--)
		{
			test[i] =(byte)(num & 0xFF);
			System.out.print(test[i]);
			
			num>>=8;
		}
		System.out.println();
		
		for(int i =7; i>-1; i--)
		{
			test[i] = (byte) (~test[i]);
			System.out.print(test[i]);
		}

		return test;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(bitString(10));
		System.out.println(countBitSet(5));
		System.out.println(Arrays.toString(countBitLong(Long.MAX_VALUE)));
		//System.out.println(Arrays.toString(flipBitsInChar(Long.MAX_VALUE-64)));
		flipBitsInChar(Long.MAX_VALUE);
	}

}
