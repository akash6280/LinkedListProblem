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
	
	public void append(Node<T> newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			tail.setNext(newNode);
			tail=newNode;
	}
	
	public void printMyNodes() {
		Node<T>tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getData()+" ");
			tempNode=tempNode.getNext();
		}
	}
	
	public void insertNodeBetween(Node<T> beforeNode,Node<T> newNode)
	{
		Node<T>tempNode=beforeNode.getNext();
		beforeNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public void popFirst() {
		head = head.getNext();
	}
	
	public void popLast() {
		Node<T> tempNode=head;
		Node<T> temp = head;
		while (temp.getNext() != tail) {
			temp = temp.getNext();
		}
		tail = temp;
		tail.setNext(null);
	}
	
	public int find(T key) {
		Node<T> currentNode = head;
		while (currentNode != null) {
			if (currentNode.getData()==key) {
				return 1;
			}
			currentNode = currentNode.getNext();
		}
		return 0;
	}
}
