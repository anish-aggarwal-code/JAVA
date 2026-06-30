package package3;

//import java.util.LinkedList;

public class LL {
	Node tail;
	Node head;
	int size;
	
	public void insertFirst(int val)
	{
		Node insertedNode = new Node(val);
		insertedNode.next = head;
		head = insertedNode;
		
		
		if(tail==null)
		{
			tail = head;
			
		}
		size = size+1;
		
	}
	public void insertLast(int val)
	{
		if(tail==null)
		{
			insertFirst(val);
		}
		Node insertedNode = new Node(val);
		tail.next = insertedNode;
		tail = insertedNode;
		size = size+1;
		
	}
	public void insertAtIndex(int val,int index)
	{
		Node nodeInserted = new Node(val);
		Node tracer = head;
		for(int i=1;i<index;i++)
		{
			tracer = tracer.next;
		}
		tracer.next = nodeInserted;
		
		
	}
	public void display()
	{
		
		Node temp = head;
		while(temp != null)
		{
		System.out.print(temp.value+" --> ");
		temp = temp.next;
		}
		if(temp == null)
		{
			System.out.print("END");
		}
	}

	
}
class Node
{
	int value;
	Node next;
	
	public  Node(int value)
	{
		this.value = value;
	}
	public  Node(int value,Node next)
	{
		this.value = value;
		this.next = next;
	}
	
}