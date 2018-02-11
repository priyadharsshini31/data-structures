import java.io.*;
import java.util.*;
class Doublenode
{
	Doublenode prev;
	int data;
	Doublenode next;
	public Doublenode(Doublenode prev,int data,Doublenode next)
	{
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	public int getData()
	{
		return data;
	}
	public Doublenode getPrev()
	{
		return prev;
	}
	public Doublenode getNext()
	{
		return next;
	}
	public void setPrev(Doublenode prev)
	{
		this.prev = prev;
	}
	public void setNext(Doublenode next)
	{
		this.next = next;
	}
}
class doublefunctions
{
	Doublenode head;
	public void insert(int data)
	{
		Doublenode ptr = head;
		Doublenode nptr;
		if(head == null)
		{
			head = new Doublenode(null,data,null);
		}
		else
		{
			
			ptr = head;
			while(ptr.getNext()!=null)
			{
				
				ptr = ptr.getNext();
			}
			nptr = new Doublenode(null,data,null);
			ptr.setNext(nptr);
			nptr.setPrev(ptr);
			
		}
			
		
	}
	public void display()
	{
		Doublenode ptr = head;
		while(ptr!= null)
		{
			
			System.out.println("The element is" + ptr.getData());
			ptr = ptr.getNext();
		}
	}
	public void displayrev(){
		
		Doublenode ptr = head;
		while(ptr.getNext()!=null)
		{
			ptr = ptr.getNext();
		}
		
		while(ptr!=null)
		{
			System.out.println("The elements in reverse order is " + ptr.getData());
			ptr = ptr.getPrev();
		}
	}
}
public class Doublylinkedlist {
	public static void main(String[] args)
	{
		doublefunctions df = new doublefunctions();
		df.insert(10);
		df.insert(20);
		df.insert(30);
		df.insert(40);
		df.display();
		df.displayrev();
		
	}
	

}
