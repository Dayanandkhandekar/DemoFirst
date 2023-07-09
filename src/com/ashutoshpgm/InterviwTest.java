package com.ashutoshpgm;

import java.util.Scanner;

public class InterviwTest {
public static void main(String[] args) {
	A.m1();
}
}
class A{
	
	static void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("1.fact 2.add 3.greater");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		int fact=1;
	
		switch(ch){
		case 1:
			for(int i=1;i<=num1;i++)
			{
			fact =fact*i;}
			System.out.println("factorial is =="+fact);
			break;
		case 2:
		int add = num1+num2;
		System.out.println("addition of 2 number==="+add);
		break;
		case 3:
			if (num1 >num2)
			System.out.println("num1 is greater");
			else
				System.out.println("num2 is greater");
			break ;
			default :
				System.out.println("invalid choice");
		
		
			
		}
	}
		
}