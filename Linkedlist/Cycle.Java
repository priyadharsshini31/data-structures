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
	Nodes head;
	Nodes ptr;
	public void insertfunction(int data)
	{
		if(head == null)
		{
			head = new Nodes(data,null);
			System.out.println("Inserted the first element");
		}
		else
		{
			ptr = head;
			while(ptr.getNext()!= null)
			{
				ptr = ptr.getNext();
			}
			ptr.setNext(new Nodes(data,null));
			System.out.println("Inserted");
		}
	}
	public void display()
	{
		System.out.println("hello");
		Nodes ptr = head;
		while(ptr!=null)
		{
			System.out.println("the data is"+ptr.getData());
			ptr=ptr.getNext();
		}
	}
	
	
	public void iscycle()
	{
		Nodes fastnode = head;
		Nodes slownode = head;
		while(fastnode!=null && fastnode.getNext()!=null)
		{
			fastnode = fastnode.getNext().getNext();
			slownode = slownode.getNext();
			if(fastnode == slownode)
			{
				System.out.println("There is Cycle");
			}
		}
		System.out.println("No cycle");
	}
}
 
public class insertion {
	public static void main(String[] args)
	{
	insert insert1 = new insert();
	insert1.insertfunction(10);
	insert1.insertfunction(20);
	insert1.insertfunction(30);
	insert1.insertfunction(40);
	insert1.insertfunction(50);
	insert1.display();
	insert1.iscycle();
	}

}
