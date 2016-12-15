//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		SyntaxChecker test = new SyntaxChecker("(abc(*def)");
		System.out.println("does: '(abc(*def)' follow correct syntax? \n" + test.checkExpression());
		test = new SyntaxChecker("[{}]");
		System.out.println("does: '[{}]' follow correct syntax? \n" + test.checkExpression());
		test = new SyntaxChecker("[");
		System.out.println("does: '[' follow correct syntax?  \n" + test.checkExpression());
		test = new SyntaxChecker("[{<()>}]");
		System.out.println("does: '[{<()>}]' follow correct syntax? \n " + test.checkExpression());
		test = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println("does: '{<html[value=4]*(12)>{$x}}' follow correct syntax?  \n" + test.checkExpression());
		test = new SyntaxChecker("[one]<two>{three}(four)");
		System.out.println("does: '[one]<two>{three}(four)' follow correct syntax?  \n" + test.checkExpression());
		test = new SyntaxChecker("car(cdr(a)(b)))");
		System.out.println("does: 'car(cdr(a)(b)))' follow correct syntax? \n" + test.checkExpression());
		test = new SyntaxChecker("car(cdr(a)(b))");
		System.out.println("does: 'car(cdr(a)(b))' follow correct syntax? \n " + test.checkExpression());
	}
}