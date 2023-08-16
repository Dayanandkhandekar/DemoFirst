package com.poojapgm;

import java.util.Scanner;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		fibonacci();
	}
     static void fibonacci()
     {
    	 //Fibonacci series
    	 //0 1 1 2 3 5 8 13
    	  //int t; input number from user
    	   int a=0; //start number zero
    	   int b=1; //second start number one
    	   int c;// addition two numbers
    	   System.out.println("Enter range:");// message for user
    	   Scanner r=new Scanner(System.in); //scanner class use karun object create
    	   int t=r.nextInt(); //object reference  krun value store integer t
    	   for(int i=1;i<=t;i++)    // 1<=t then increase value 
    	   {
    		   System.out.println(a+"");//first display 0 number //(a+"for space")
    		   c=a+b;  // c variable madhe a value 0 and b value 1 store
    		   a=b;    //b value 1 is stored in a
    		   b=c;     //now c is value 1 is going to variable b is value 1
    	   }
     }
}
  

      
