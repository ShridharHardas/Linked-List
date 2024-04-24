package LinkedList;

import java.util.LinkedList;

public class LinkedListInsertionAtEnd {
 Node head;
 class Node
 {
	 int data;
	 Node next;
	 Node(int d)
	 {
		 data=d;
		 next=null;
	 }
 }
	 public void InsertionAt(int newdata)
	 {
		 Node newNode=new Node(newdata);
		 if(head==null)
		 {
			head=new Node(newdata);
			return;
		 }
		 newNode.next=null;
		 Node temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
			 
		 }
		 temp.next=newNode;
		 return;
	 }
	 public void InsertionAtBegining(int newData)
	 {
		 Node newNode=new Node(newData);
		 newNode.next=head;
		 head=newNode;
	 }
	 public void InsertionAtInBetween(Node Prev_node,int newData)
	 {
		 Node newNode=new Node(newData);
		 if(Prev_node==null)
		 {
			 System.out.println("Enter the Valid Input of Linked List");
		 }
		 newNode.next=Prev_node.next;
		 Prev_node.next=newNode;
	 }
	 public void Delete(int position)
	 {
		 if(head==null)
			 return;
		 Node temp=head;
		 if(position==0)
		 {
			 head=temp.next;
			 return;
		 }
		 for(int i=0;temp.next!=null && i<position-1;i++)
		 {
			 temp=temp.next;
		 }
		 if(temp==null && temp.next==null)
		 {
			 return;
		 }
		 temp.next=temp.next.next;
	 }
	 public void ReversalLLIterative()
	 {
		 Node current=head;
		 Node nextptr=null;
		 Node prev=null;
		 while(current!=null)
		 {
			 nextptr=current.next;
			 current.next=prev;
			 prev=current;
			 current=nextptr;
		 }
		 head=prev;
		 return;
	 }
	 public void Recursively(Node curr,Node prev)
	 {
		 if(curr.next==null)
		 {
			 head=curr;
			 curr.next=prev;
			 return;
		 }
		 Node nextptr=curr.next;
		 curr.next=prev;
		 Recursively(nextptr, curr);
	 }
	 public void MiddleLinkedList()
	 {
		 Node fast=head;
		 Node slow=head;
		 while(fast!=null && fast.next!=null)
		 {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 System.out.println("The Middle Data in an Linked List is"+" "+slow.data);
	 }
	 public void CircularDetection()
	 {
		 Node fast=head;
		 Node slow=head;
		 int flag=0;
		 while(slow!=null && fast!=null && fast.next.next!=null)
		 {	 slow=slow.next;
		 	 fast=fast.next.next;
			 if(fast==slow)
			 {
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println("Loop is Not Detected");
		 }
		 else
		 {
			 System.out.println("Loop is Detected");
		 }
	 }
	 
	 
	public void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
		 
	 
 
	public static void main(String[] args) {
		LinkedListInsertionAtEnd l1=new LinkedListInsertionAtEnd();
		l1.InsertionAt(2);
		l1.InsertionAt(4);
		l1.InsertionAt(6);
		l1.InsertionAt(8);
		l1.InsertionAtBegining(1);
		l1.InsertionAtInBetween(l1.head.next.next.next, 7);
		l1.Delete(3);
		l1.display();
		System.out.println();
		System.out.println("Reversal Linked List is:");
		//l1.ReversalLLIterative();
//		l1.Recursively(l1.head, null);
//		l1.display();
//		System.out.println();
//		l1.MiddleLinkedList();
//		l1.display();
		//Circular Linked List 
		Node temp=l1.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=l1.head;
		l1.CircularDetection();
		
	}

}
