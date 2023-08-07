package com.poojapgm;

import java.util.Scanner;

public class AssignmentConditional {
 
	public static void main(String[] args) {
		v1();
		v2();
		v3();
		
	}
	static void v1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
		if(age>18)
			System.out.println("You are eligible for voting");
		else
			System.out.println("You are not eligible for voting");
		
	}
	static void v2()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Year");
		int year=s.nextInt();
		if(year % 4 == 0)
			System.out.println("Year is a leap year");
		else
			System.out.println("Year is  not a leap year");
	}
	static void v3()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		if(n%2==0)
			System.out.println("Number is even");
		else 
			System.out.println("Number is odd");
	}
}
