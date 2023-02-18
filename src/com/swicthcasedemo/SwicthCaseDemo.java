package com.swicthcasedemo;

import java.util.Scanner;

public class SwicthCaseDemo {
    public static void main(String[] args) {
    	sicthCaseDemo();
	}
    
    static void sicthCaseDemo(){
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter First Num");
    	int num1=sc.nextInt();
    	
    	System.out.println("Enter Second  Num");
    	int num2=sc.nextInt();
    	
    	System.out.println("1.Addition   2. Sub  3.Mul   4.Div");
    	
    	System.out.println("Enter ur choice");
    	int choice=sc.nextInt();
    	
    	
    	if(choice ==1) {
    		 System.out.println("Addition==="+(num1+num2));
    	}else if(choice ==2) {
    		System.out.println("Sub==="+(num1-num2));
    	}else if(choice ==3) {
    		System.out.println("Mul==="+(num1*num2));
    	}else if(choice ==4) {
    		System.out.println("Div==="+(num1/num2));
    	}else {
    		System.out.println("Invalid Choice");
    	}
    	
    	
		
		  switch (choice) { 
		  case 1: System.out.println("Addition==="+(num1+num2));
		  break;
		  
		  case 2: System.out.println("Sub==="+(num1-num2));
		  break; 
		  case 3:
		  System.out.println("Mul==="+(num1*num2));
		  break; 
		  case 4:
		  System.out.println("Div==="+(num1/num2));
		  break;
		  
		  default : System.out.println("Invalid choice");
		  
		  }
		 
    }
}
