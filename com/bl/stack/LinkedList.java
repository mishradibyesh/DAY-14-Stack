package com.bl.stack;

public class LinkedList {

	
	Node head ,tail;
	int size ;

	// adding method at initial
	public  void addAtFirst(int val) {
		Node node = new Node();
		node.setData(val);
		if(head==null) {
			head=node;	
		}
		else
		{
			node.setNext(head);
			head=node;
		}
		size++;
	}
	
	// display method
		public void display() {
			Node temp;
			temp=head;
			for(int i=0 ; i<size ; i++)
			{
				System.out.println(temp.getData()) ;
				temp = temp.getNext();
			}
		}
}
