//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import java.util.regex.Pattern;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;
	private String[] test;
	
	public PostFix()
	{
	}

	public PostFix(String exp)
	{		
		expression = exp;
		stack = new Stack<Double>();
		test = exp.split(" ");
		solve();
	}

	public void setExpression(String exp)
	{
		expression = exp;
	}

	public double calc(double number1, double number2, String op)
	{
		double result = 0.0;
		
		 if (op.equals("/"))
             result = number1 / number2;
         else if(op.equals("*"))
             result = number1 * number2;
         else if(op.equals("+"))
             result = number1 + number2;
         else if(op.equals("-"))
             result = number1 - number2;
		 
		 return result;
	}

	public void solve()
	{
		double number1;
		double number2;
		double result=0.0;
		
		for(int j = 0; j < test.length; j++)
		{
            String token = test[j];
            if (!"+".equals(token) && !"*".equals(token) && !"-".equals(token) && !"/".equals(token))
            	stack.push(Double.parseDouble(token)); 
            
            else 
            {
            	
                String op = test[j];
                	number2 = stack.pop();
                	number1 = stack.pop();
                	stack.push(calc(number1,number2,op));
                	//System.out.println(stack.peek());
            }
            
		}
		
	}

	//add a toString
	public String toString()
	{
		return stack.pop() + "";
	}
	
	
	public static void main(String[] args)
	{
		PostFix test = new PostFix("2 7 + 1 2 + +");
		System.out.println(test);
		test = new PostFix("1 2 3 4 + + +");
		System.out.println(test);
		test = new PostFix("9 3 * 8 / 4 +");
		System.out.println(test);
		test = new PostFix("3 3 + 7 * 9 2 / +");
		System.out.println(test);
		test = new PostFix("9 3 / 2 * 7 9 * + 4 -");
		System.out.println(test);
		test = new PostFix("5 5 + 2 * 4 / 9 +");
		System.out.println(test);
	}
}

