package com.bridgelabz.linked_list;

public class Node {

	/*class node that holds data and a reference to the next node in the list*/
	
	public int data;
	public Node next;
	
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return "Node {"+ "data =" +data +", next =" + next + '}';
				
	}

}
