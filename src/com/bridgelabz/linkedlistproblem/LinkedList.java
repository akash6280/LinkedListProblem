package com.bridgelabz.linkedlistproblem;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	
	LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(Node<T> newNode) {		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head=newNode;
		}
	}

}
