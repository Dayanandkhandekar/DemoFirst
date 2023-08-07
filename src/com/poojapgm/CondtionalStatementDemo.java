package com.poojapgm;

import java.util.Scanner;

public class CondtionalStatementDemo {
	
	public static void main(String[] args) {
		//s1();
		s2();
	}
	
 static void s1() 
 {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number");
	int n1=s.nextInt();
	if(n1>0)
	System.out.println("Number is positive");
	System.out.println("Number is Negative");
	
	
}
 static void s2()
 {
	 Scanner s= new Scanner(System.in);
		System.out.println("Enter Number");
		int n2=s.nextInt();
		if(n2>0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is Negative");	
		
 }
}
