import java.io.*;
import java.util.*;
class stackarray
{
	int data;
	int top = -1;
	int MAXSIZE = 100;
	int arr[] = new int[MAXSIZE];
	public void push(int data)
	{
		if(top>MAXSIZE)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			arr[++top]= data;
		}
	}
	public void display()
	{
		int ptr = top;
		while(ptr>=0)
		{
			System.out.println("The element is"+ arr[ptr]);
			ptr--;
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			int x= arr[top--];
			System.out.println("The element deleted is " + x);
		}
	}
}
public class stack {
	public static void main(String[] args)
	{
		stackarray sa = new stackarray();
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.display();
		sa.pop();
		sa.display();
		sa.pop();
		sa.display();
		sa.pop();
		sa.display();
		sa.pop();
		sa.display();
	}

}
