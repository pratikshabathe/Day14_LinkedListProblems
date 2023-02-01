package com.bridgelabz.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblem {

	public static void display() {
		System.out.println("Welcome to data structure problems using java Generics");
	}
	
	 Node head;
	    Node tail;

	    public Node  push(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	          //  tail = newNode;
	        } else {
	            Node temp = head;// 56=>30=>70
	            this.head = newNode;
	            newNode.next = temp;
	        }
	        return newNode;
	    }

	    public void print() {
	        if (head == null) {
	            System.out.println("Linked List is Empty");
	        } else {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data+ " ");
	                temp = temp.next;
	            }
	        }
	    }

	    public void append(int data) { // 56=> 30=> 70
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            this.tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void insertInBetween(Node previousNode ,Node newNode){
	        Node tempNode = previousNode.next;
	        previousNode.next = newNode;
	        newNode.next = tempNode;
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to linkedList DataStructure Program");
	        
	        Scanner scanner = new Scanner(System.in);
	        LinkedList linkedList = new LinkedList();
  	        linkedList.push(70);
  	        linkedList.push(30);
  	        linkedList.push(56);
  	     
  	      System.out.printf(" add the data at the start: " +linkedList);
	    }
}
