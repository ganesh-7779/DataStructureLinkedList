package com.bridgelabz.linkedlist;

public class Runner<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 LinkedList <Integer> List = new LinkedList<Integer>();
		List.add(56);
		List.add(30);
		List.add(40);
		List.add(70);
		System.out.println("Linked list elements");
		List.show();
		System.out.println();
	    List.SearchOperation(56);
	    List.deleteAt(2);
		List.show();
		System.out.println("The size of the list is: "+List.size());

	}
}
