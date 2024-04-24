package LinkedList;

public class LinkedListInsertion {
	Node head;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
		data=d;
		next=null;
		}
	}
	public void InsertionAtEnd(int newdata)
	{
		Node newNode=new Node(newdata);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=null;
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void InsertionAtBeginning(int newData)
	{
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	public void Deletion(int position)
	{
		
		if(head==null)
			return;
		Node temp=head;
		if(position==0)
		{
			head=temp.next;
			return;
		}
		for(int i=0;i<position-1 && temp!=null; i++)
		{
			temp=temp.next;
		}
		if(temp==null && temp.next==null)
		{
			return;
		}
		temp.next=temp.next.next;
	}
	public void Midddle(Node Prev,int newData)
	{
		Node newNode=new Node(newData);
		newNode.next=Prev.next;
		Prev.next=newNode;
	}
	
	public void display()
	 {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void ReverseIterative()
	{
		Node curr=head;
		Node nextptr=null;
		Node prev=null;
		while(curr!=null)
		{
			nextptr=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextptr;
		}
		head=prev;
		return;
		
	}
	public void Recurrence(Node curr,Node prev)
	{
		if(curr.next==null)
		{
			head=curr;
			curr.next=prev;
			return;
			}
		Node nextptr=curr.next;
		curr.next=prev;
		Recurrence(nextptr, curr);
	}

	public static void main(String[] args) {
		LinkedListInsertion l1=new LinkedListInsertion();
		l1.InsertionAtEnd(2);
		l1.InsertionAtEnd(4);
		l1.InsertionAtEnd(8);
		l1.InsertionAtEnd(10);
		l1.InsertionAtEnd(12);
		//l1.display();
		l1.InsertionAtBeginning(1);
		l1.Midddle(l1.head.next.next.next, 9);
		//l1.display();
		//l1.Deletion(0);
		//l1.ReverseIterative();
		//l1.Recurrence(l1.head, null);
		l1.display();

	}

}
