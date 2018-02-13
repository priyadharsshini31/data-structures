import java.io.*;
import java.util.*;
class stack1
{
	int MAXSIZE = 100;
	char arr[] = new char[MAXSIZE];
	int top = -1;
	public void push(char data)
	{
		arr[++top]=data;
	}
	public char pop()
	{
		return arr[top--];
	}
	public boolean isEmpty()
	{
		return (top==-1)?true:false;
	}
	public char peek()
	{
		return arr[top];
	}
}
class topostfix
{
	stack1 s1 = new stack1();
	public String convert(String str)
	{
		String postfix = "";
		char symbol;
		for(int i=0;i<=str.length()-1;++i)
		{
			symbol=str.charAt(i);
			if(Character.isDigit(symbol) || Character.isLetter(symbol))
			{
				postfix = postfix + symbol;
			}
			else if(symbol == '(')
			{
				s1.push(symbol);
			}
			else if(symbol == ')')
			{
				while(s1.peek()!='(')
				{
					postfix = postfix + s1.pop();
				}
				s1.pop();
			}
			else
			{
				while(!s1.isEmpty() && !(s1.peek()=='(') && prec(symbol) <= prec(s1.peek())  )
				{
					postfix = postfix + s1.pop();
				}
				s1.push(symbol);
			}
		}
		while(!s1.isEmpty())
		{
			postfix = postfix + s1.pop();
		}
		
		return postfix;
	}
	public int prec(char symbol)
	{
		if(symbol == '+' || symbol =='-')
		{
			return 1;
		}
		if(symbol =='*' || symbol == '/' || symbol =='%')
		{
			return 2;
		}
		return 0;
	}
}
public class infixtopostfix
{
	public static void main(String[] args)
	{
		topostfix tp = new topostfix();
		String str = "a+b*(c*d-e)*(f)";
		String postfix = tp.convert(str);
		System.out.println("The converted string is "+postfix);
				
	}
}
