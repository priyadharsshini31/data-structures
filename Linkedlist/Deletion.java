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
	public void delete(int data){
		Nodes ptr = head;
		Nodes prev = ptr;
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			if(head.getData()==data)
			{
				if(head.getNext()==null)
				{
					head = null;
				}
				else
				{
					head = ptr.getNext();
				}
			}
			else
			{
				while(ptr.getData()!=data && ptr.getNext()!=null)
				{
					prev = ptr;
					ptr = ptr.getNext();
				}
				if(ptr.getData()==data)
				{
					prev.setNext(ptr.getNext());
				}
				else
				{
					System.out.println("No such data");
				}
			}
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
	insert1.delete(40);
	insert1.display();
	insert1.delete(50);
	insert1.display();
	insert1.delete(10);
	insert1.display();
	insert1.delete(60);
	}

}
