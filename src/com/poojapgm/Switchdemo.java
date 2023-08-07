package com.poojapgm;

import java.util.Scanner;

public class Switchdemo {
	
	public static void main(String[] args) {
		add();
		
	}
	 static void add()
	 {
		 Scanner p1=new Scanner(System.in);
		 System.out.println("Enter my choice");
		 int choice=p1.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("enter number"); 
    		 int n=p1.nextInt();
    		 int i;
    		 int fact=1;
    		 for(i=1;i<=n;i++)
    		 {
    			 fact=fact*i;
    		 }
    		 System.out.println("factorial number is =="+fact);
    		 break;
		 case 2:
			 System.out.println("enter first number");
				int n1=p1.nextInt();
				System.out.println("enter second number");
				int n2=p1.nextInt();
				int result=n1+n2;
				System.out.println("addition=="+result);
    		 
		 }
	 }

}
