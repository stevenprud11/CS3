//� A+ Computer Science
// www.apluscompsci.com   

//exception example 2

public class ExceptionTwo
{
   public static void main(String args[]) throws Exception
   {
	   try
	   {
		   int num=32;
		   int x = 0;
		   num = 32/x;
		   	//if()
		   
			//Exception is a checked Exception
		   System.out.println("Made it here");

	   }
	   catch(ArithmeticException e)
	   {
		   System.err.println(e);
	   }
	   catch(Exception e)
	   {
		   System.err.println("Children then the parents");
	   }
	   finally
	   {
		   System.out.println("The End");
	   }
	}
}
