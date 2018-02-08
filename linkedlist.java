
import java.io.*;
import java.util.*;
class linkedlist
{
	int data;
	linkedlist next;
	
}
class listfunctions
{
	linkedlist head;
	linkedlist start;
	linkedlist end;
	public void insert(int a)
	{
		linkedlist nptr = new linkedlist();
		if(start == null)
		{
	    start=end=head=nptr;
		nptr.data = a;
		nptr.next = null;
		System.out.println("Inserted the first node" + a);
		}
		else
		{
			nptr.data = a;
			nptr.next = null;
			head.next = nptr;
			end=head=nptr;
			System.out.println("Inserted the node" + a);
		}
	}
	public void display()
	{
		head = start;
		while(head != null )
		{
			System.out.println(head.data);
			head = head.next;
			
		}
	}
	public void delete(int a)
	{
		head = start;
		linkedlist current = head;
		while(head.data!=a && head.next != null)
		{
			current = head;
			head = head.next;
			
		}
			if(head.data == a )
			{
				if(head == start)
				{
					start = head.next;
					head = start;
					System.out.println("deleted the start node");
				}
				else if(head.next == null)
				{
					current.next = null;
					head = current;
					System.out.println("deleted the last node");
				}
				else
				{
					current.next = head.next;
					head = current.next;
					System.out.println("deleted the middle node");
				}
			}
			else
			{
				System.out.println("not such data found");
			}

}
	public void length()
	{
		head = start;
		int count=1;
		while(head.next!=null)
		{
			count++;
			head = head.next;
		}
		System.out.println("length is" +  count);
	}

	}
	

public class method
{
	public static void main(String[] args)
	{
		listfunctions lf = new listfunctions();
		lf.insert(10);
		lf.insert(20);
		lf.insert(30);
		lf.insert(40);
		lf.display();
		lf.length();
		lf.delete(10);
		lf.display();
		lf.length();
		lf.delete(20);
		lf.display();
		lf.length();
		lf.delete(40);
		lf.display();
		lf.length();
		lf.delete(50);
		lf.display();
		lf.length();
	}
}
