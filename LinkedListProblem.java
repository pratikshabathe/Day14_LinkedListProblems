package com.bridgelabz.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblem {

	public static void display() {
		System.out.println("Welcome to data structure problems using java Generics");
	}
	
	 Node head;
	    Node tail;

	    public  void push(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	        	newNode.next = head;																																		
	        	head = newNode;
	        }
	        
	    }
	    
	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	        	tail.next = newNode;
	        	tail = newNode;
	        }
	        
	    }

	    public void print() {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data+ " ");
	                temp = temp.next;
	            }
	        }

	    
	    
	    public static void main(String[] args) {
	        System.out.println("Welcome to linkedList DataStructure Program");
	        
	        Scanner scanner = new Scanner(System.in);
	        LinkedList linkedList = new LinkedList();
  	        linkedList.push(56);
  	        linkedList.push(30);
  	        linkedList.push(70);
  	     
  	      System.out.printf(" add the data at the end: " +linkedList);
	    }
}
