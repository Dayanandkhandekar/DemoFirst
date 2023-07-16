package com.someshpgm;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	List list1 = new ArrayList();  //normal Declaration
	list1.add(10);
	list1.add(10.00);
	list1.add('s');
	list1.add("Ten");
	
    System.out.println("List==="+list1);

    List <String> languages = new ArrayList <String>(); //Generic Declaration
    languages.add("Python");
    languages.add("Java");
    languages.add("c++");
    languages.add("c");
    
    System.out.println("Languages==="+languages);
}
}
