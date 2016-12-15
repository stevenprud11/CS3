//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;
	private String[] hold;

	public SyntaxChecker()
	{
		symbols = new Stack();
		setExpression("");
	}

	public SyntaxChecker(String s)
	{
		symbols = new Stack();
		hold = s.split("");
		exp = s;
	}
	
	public void setExpression(String s)
	{	
		exp = s;
	}

	public boolean checkExpression()
	{
		
		for(int i =0; i<hold.length;i++)
		{
			//System.out.println(hold[i]);
			//System.out.println(hold[i]);
			if(hold[i].equals("[")
					|| hold[i].equals("]")
					|| hold[i].equals("{") 
					|| hold[i].equals("}")
					|| hold[i].equals("<")
					|| hold[i].equals(">")
					|| hold[i].equals("(")
					|| hold[i].equals(")"))
			{
				symbols.push(hold[i].charAt(0));
			}

			
		}
		//System.out.println(symbols);
		
		int length=0;
		while(!symbols.isEmpty())
		{
			length++;
			symbols.pop();
		}
		if(length%2!=0)
			return false;
		else 
			return true;
		//return true;
	}

	public String toString()
	{
		return "";
	}
	//write a toString
}