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

	// delete at first method
	public void popAtFirst() {
		Node temp;
		temp=head;
		while(temp != null) {
			System.out.print("peak in stack is ");
			peak();
			temp=temp.getNext();
			head = temp;
			size--;
			System.out.println("pop operation done !");
		}
		if(head == null) {
			System.out.println("the stack is empty now");
		}
	}
	public void peak() {

		System.out.println(head.getData()) ;
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
