class node
{
	int data;
	node next;
	node(int data,node next)
	{
		this.data = data;
		this.next = next;
	}
	
}
class insert
{
	node head;
	node end;
	public void insertion(int data)
	{
		//node head=null;
		//node end=null;
		if(head == null)
		{
			head = new node(data,null);
			end= head;
			System.out.println("inserted the first node");
		}
		//end  = head;
		else
		{
			end.next=new node(data,null);
			end = end.next;
			System.out.println("inserted");
		}
		
	}
	public void display()
	{
		node tmp=head;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
}
public class insertionWithEnd
{
	public static void main(String[] args)
	{
		insert in = new insert();
		in.insertion(10);
		in.insertion(20);
		in.insertion(30);
		in.insertion(40);
		in.display();
	}
}
