package com.ashutoshpgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
 public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	System.out.println("enter any string: ");
	
	String s1 = sc.next();
	//sc.close();
	
	Map<Character, Integer> map=new HashMap<Character, Integer>();

	for(int i=0; i<s1.length();i++) {
 	char c=s1.charAt(i);
 	if (map.containsKey(c)) {
 		
			map.put(c,map.get(c)+1);
 	}
 	else {
 		map.put(c, 1);
 	}
 } 
	System.out.println("character count: "+map);
	
	
	
}
}

