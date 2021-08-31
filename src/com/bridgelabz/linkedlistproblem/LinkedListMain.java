package com.bridgelabz.linkedlistproblem;

public class LinkedListMain {
	public static void main(String[] args) {
		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		LinkedList myLinkedList= new LinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		
		int found=myLinkedList.find(30);
		if(found==1)
			myLinkedList.insertNodeBetween(secondNode,new Node(40));
		
		myLinkedList.printMyNodes();
		
	}
}
