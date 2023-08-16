package com.someshpgm;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
	add();	
	}
	static void add() {
	LinkedList<String> list = new LinkedList<String> ();
	
	 list.add("Apple");
     list.add("Ball");
     list.add("Cat");
     list.add("Elephant");
     list.add("Fish");
     
     System.out.println("List" + list);
	}
}
