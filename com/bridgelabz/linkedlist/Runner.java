package com.bridgelabz.linkedlist;

public class Runner<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList <Integer> List = new LinkedList<Integer>();
		List.add(56);
		List.add(70);
		List.SearchOperation(30);
		List.AtStart(56);
		List.AddAtIndex(2, 40);
		List.show();
		System.out.println("Inserted 40 to 30"); 

	}
}
