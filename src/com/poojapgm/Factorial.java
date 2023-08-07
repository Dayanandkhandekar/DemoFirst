package com.poojapgm;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		fact();
	}
 static void fact()
 {
	  int fact=1;
	 //input number 5---->120(5*4*3*2*1)
	 System.out.println("Enter Any Number:");  //Message pass 
	 Scanner sc=new Scanner(System.in);//scanner class use karun object create
	 int n=sc.nextInt();// variable n madhe  integer value store input Scanner method use karun
	 for(int i=1;i<=n;i++) //i=1 start n last number
	 {
		 fact=fact*i;
	 }
	 System.out.println("factorial number is  "+fact);
	 
 }
}
