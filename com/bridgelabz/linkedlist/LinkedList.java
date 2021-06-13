package com.bridgelabz.linkedlist;

/**
 * Purpose: Implementation of Linked List Data Structure
 * @author Ganesh Gavhad
 * Version 1.0
 * @param <T>
 */
public class LinkedList<T> {

	Node<T> head;

	/**
	 * Adding Node to the linkedList
	 * @param data
	 */
	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}
	/**
	 * @param Node data added at Start
	 */
	public void AtStart(T data) {
		Node<T> node =new Node<>();
		node.data=data;
		node.next=head;
		head=node;
	}
	/**
	 * Printing The Data Of Node till next equal to null
	 */
	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}

