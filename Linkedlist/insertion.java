import java.io.*;
import java.util.*;
class Nodes
{
	int data;
	Nodes next;
	Nodes(int data,Nodes next)
	{
		this.data = data;
		this.next = next;
	}
	public int getData()
	{
		return data;
	}
	public Nodes getNext()
	{
		return next;
	}
	public void setNext(Nodes next)
	{
		this.next = next;
	}
}
class insert
{
	node head;
	node ptr;
	public void insertfunction(int data)
	{
		if(head == null)
		{
			head = new node(data,null);
			System.out.println("Inserted the first element");
		}
		else
		{
			ptr = head;
			while(ptr.getNext()!= null)
			{
				ptr = ptr.getNext();
			}
			ptr.setNext(new node(data,null));
			System.out.println("Inserted");
		}
	}
	public void display()
	{
		System.out.println("hello");
		node ptr = head;
		while(ptr!=null)
		{
			System.out.println("the data is"+ptr.getData());
			ptr=ptr.getNext();
		}
	}
}
 
public class insertion {
	public static void main(String[] args)
	{
	insert insert1 = new insert();
	insert1.insertfunction(10);
	insert1.insertfunction(20);
	insert1.insertfunction(30);
	insert1.insertfunction(30);
	insert1.insertfunction(40);
	insert1.display();
	}

}
