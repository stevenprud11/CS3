import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PreFix {

	private Stack<Double> stack;
	private String exp;
	private String[] test;
	private Double result;
	
	public PreFix()
	{
		stack = new Stack();
	}
	
	public PreFix(String s)
	{
		result=0.0;
		stack = new Stack<Double>();
		exp = s;
		test = s.split(" ");
		solve();
	}
	
	public double calc(double number1, double number2, String op)
	{
		double calc = 0.0;
		
		 if (op.equals("/"))
            calc = number1 / number2;
        else if(op.equals("*"))
            calc = number1 * number2;
        else if(op.equals("+"))
            calc = number1 + number2;
        else if(op.equals("-"))
            calc = number1 - number2;
		
		 return calc;
	}
	public void solve()
	{
		double number1;
		double number2;
		
		for(int j = test.length-1; j>-1; j--)
		{
            String token = test[j];
            
            if (!"+".equals(token) && !"*".equals(token) && !"-".equals(token) && !"/".equals(token))
            	stack.push(Double.parseDouble(token)); 
            else 
            {
            	
                String op = test[j];
                	number1 = stack.pop();
                	number2 = stack.pop();
                	stack.push(calc(number1,number2,op));

            }
            
		}
	}
	
	
	public String toString()
	{
		return "the result of the prefix equation [" + exp + "] is " + stack.pop();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner kb = new Scanner(new File("postfixEXP.in"));
		
		while(kb.hasNextLine())
		{

			PreFix test = new PreFix(kb.nextLine());
			System.out.println(test);
		}
	}
}
