package com.poojapgm;

import java.util.Scanner;

public class Switchexp {
	
public static void main(String[] args) {
	//ifelseifdemo();
	switchdemo();
}
static void ifelseifdemo()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First num");
	int num1=sc.nextInt();
	
	System.out.println("Enter Second num");
	int num2=sc.nextInt();
	
	System.out.println("Enter Your Choice");
	int choice=sc.nextInt();
	
	if(choice==1) {
		System.out.println("addition==="+(num1+num2));
	}
	 if(choice==2)
	{
		System.out.println("substraction==="+(num1-num2));
	}
	 if(choice==3)
	 {
		 System.out.println("multiplication=="+(num1*num2));
	 }
	 else
	 {
		 System.out.println("Invalid choice");
	 }
	 
	
}
static void switchdemo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int num1=sc.nextInt();
	
	System.out.println("Enter Second Number");
	int num2=sc.nextInt();
	System.out.println("1.Add  2.Sub  3.Multi");
	System.out.println("Enter Your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	    System.out.println("addition=="+(num1+num2));
	    break;
	case 2:
		System.out.println("substraction=="+(num1-num2));
		break;
	case 3:
		System.out.println("multiplication=="+(num1*num2));
		break;
		default:System.out.println("invalid Choice");
	}
	
}
}
