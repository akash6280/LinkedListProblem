package com.bridgelabz.linkedlistproblem;

public class LinkedListMain {
	public static void main(String[] args) {
		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
	}
}