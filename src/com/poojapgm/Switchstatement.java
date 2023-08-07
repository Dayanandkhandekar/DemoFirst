package com.poojapgm;

import java.util.Scanner;

public class Switchstatement {
	public static void main(String[] args) {
		statement();
	}
static void statement()
{
Scanner r1=new Scanner(System.in);
System.out.println("enter my choice");
int choice=r1.nextInt();
switch(choice)
{
case 1:
	System.out.println("enter year");
	int year=r1.nextInt();
	if(year%4==0)
	{
		System.out.println("this year is leap year");
	}
	else {
		System.out.println("this year is not leap year");
	}
	break;
case 2:
	System.out.println("enter number");
	int num=r1.nextInt();
	if(num%2==0 && num>=2) 
	{
	System.out.println("this number is not prime number");	
	}
	else
	{
		System.out.println("this number is prime number");
	}
	break;
case 3:
	System.out.println("enter number");
	int num1=r1.nextInt();
	if(num1<0)
	{
		System.out.println("negative number");
	}
	else
	{
		System.out.println("positive number");
	}
	break;
case 4:
	System.out.println("enter number");
	int num2=r1.nextInt();
	if(num2%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
	break;
	default:
		System.out.println("invalid number");
}

}
}
