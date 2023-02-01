package com.bridgelabz.linked_list;

public class LinkedListProblem {

	public static void display() {
		System.out.println("Welcome to data structure problems using java Generics" );
	}
	
	public static void main(String[] args) {
		display();
		
		Node firstNode = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);
		Node head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		
		Node temp = head;
		/*While loop
		 * If temp is not equal to null then print sout data
		 */
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
