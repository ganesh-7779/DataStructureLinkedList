package com.bridgelabz.linkedlist;

public class Runner<T> {

	public static void main(String[] args) {
		
		LinkedList <Integer> List = new LinkedList<Integer>();
		System.out.println("Before deletion First node");
		List.add(30);
		List.add(70);
		List.add(30);
		List.AtStart(25);
		List.AddAtIndex(2,32);
		List.show();
		List.deleteFirst();
		System.out.println("After deletion First node");
		List.show();
		List.deleteLast();
		System.out.println("Last Node Deleted");
		List.show();

	}
}
