package com.poojapgm;

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		//dowhile();
		foreachdemo();
	}
	static void dowhile()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=s.nextInt();
		
		System.out.println("Enter Second Number");
		int n2=s.nextInt();
		
		boolean g=false;
		
		do {
			System.out.println("1.Add 2.Sub 3.Mul");
			System.out.println("Enter Your Choice");
			int choice=s.nextInt();
			
			
		switch(choice) {
		case 1:
			 System.out.println("addition==="+(n1+n2));
			 break;
			 
		case 2:
			System.out.println("substraction==="+(n1-n2));
			break;
			
		case 3:
			 System.out.println("multiplication==="+(n1*n2));
			 break;
		 
	   default:
		   System.out.println("invalid Choice");
			 
		}
		System.out.println("Do u want continue.....");
		String msg=s.next();
		if(msg.equalsIgnoreCase("yes")) {
			g=true;
		}
		else {
			g=false;
		}
		}while(g);
	}
	
	
	static void foreachdemo()
	{
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		for(int b:a) {
			System.out.println("b===="+b);
		}
	}

}
