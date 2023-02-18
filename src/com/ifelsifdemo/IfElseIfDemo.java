package com.ifelsifdemo;

import java.util.Scanner;

import com.swicthcasedemo.SwicthCaseDemo;

public class IfElseIfDemo {

	
	static void ifelseIfDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num");
		int num2=sc.nextInt();
		System.out.println("Enter Third Num");
		int num3=sc.nextInt();
		System.out.println("Enter Fourth Num");
		int num4=sc.nextInt();
		
		   if(num1 > num2 && num1 > num3 && num1 > num4   ){
			   System.out.println("Num1 is Greater Number");
			  }else if(num2 > num1 && num2 > num3 && num2 > num4){
				  System.out.println("Num2 is Greater Number");
			   }else if(num3 > num1 && num3 > num2 && num3 > num4){
					  System.out.println("Num3 is Greater Number");
			  }else if(num4 > num1 && num4 > num2 && num4 > num3){
						  System.out.println("Num4 is Greater Number");
			   }
			  else{
				   System.out.println("All numbers are equal");
			   }
	}
	
	static void ifelseIfDemo2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num");
		int num2=sc.nextInt();
		System.out.println("1.Addition    2.Sub   3.Mul    4.Div");
		System.out.println("Enter ur choice");
		int choice=sc.nextInt();
		if(choice==1) {
			 System.out.println("Addition==="+(num1+num2));
		}else if(choice==2) {
			 System.out.println("sub==="+(num1-num2));
		}else if(choice==3) {
			 System.out.println("Mul==="+(num1*num2));
		}else if(choice==4) {
			 System.out.println("Div==="+(num1/num2));
		}else {
			System.out.println("Invalid choice");
		}
		
		
	}
	
	static void switchDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num");
		int num2=sc.nextInt();
		System.out.println("1.Addition    2.Sub   3.Mul    4.Div");
		System.out.println("Enter ur choice");
		int choice=sc.nextInt();
		 
		switch(choice) {
		case 3:
			int result=num1 * num2;
			System.out.println("Mul===" + (result));
			break;
		case 1:
			System.out.println("Addition===" + (num1 + num2));
			break;
		case 2:
			System.out.println("sub===" + (num1 - num2));
			break;
		case 4:
			System.out.println("Div===" + (num1 / num2));
			break;

		default:
			System.out.println("Invalid choice");
				 
		 }
	}
	
	public static void main(String[] args) {
		//ifelseIfDemo();
		//ifelseIfDemo2();
		switchDemo();
	}
	
	
	
}
