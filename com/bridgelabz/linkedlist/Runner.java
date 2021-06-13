package com.bridgelabz.linkedlist;

public class Runner<T> {

	public static void main(String[] args) {
		
		LinkedList <Integer> List = new LinkedList<Integer>();
		System.out.println("Before deletion First node");
		List.add(56);
		List.add(30);
		List.add(70);
		List.AtStart(30);
		List.AddAtIndex(2,30);
		List.show();
		List.deleteFirst();
		System.out.println("After deletion First node");
		List.show();
		List.deleteLast();
		System.out.println("Last Node Deleted");
		List.show();
		List.SearchOperation(30);

	}
}
