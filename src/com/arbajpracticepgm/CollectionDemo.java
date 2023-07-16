package com.arbajpracticepgm;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();   //Normal Declaration
		list1.add(20);
		list1.add(20.0f);
		list1.add('A');
		list1.add("ARSHI");
		System.out.println("==="+list1);
		
		List<Integer> list2=new ArrayList<Integer>();   //Generic Declaration
		list2.add(20);
		list2.add(200);
		list2.add(2000);
		list2.add(20000);
		System.out.println("==="+list2);
		
	}
}
