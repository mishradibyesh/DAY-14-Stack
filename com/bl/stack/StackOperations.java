package com.bl.stack;
public class StackOperations {
	// push method internally calling Add method
	public void push() {
		LinkedList list = new  LinkedList();
		list.addAtFirst(70);
		list.addAtFirst(30);
		list.addAtFirst(50);

		//printing the data in stack
		list.display();
	}

	//pop method to delete data
	public void pop() {
		LinkedList list = new  LinkedList();
		list.addAtFirst(70);
		list.addAtFirst(30);
		list.addAtFirst(50);
		list.popAtFirst();
	}

}


