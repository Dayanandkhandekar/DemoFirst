package com.poojapgm;

public class WhileDecrement {
	
	public static void main(String[] args) {
		//dec();
		//dec1();
		dec2();
	}
     static void dec()
     {
    	 System.out.println("Even numbers");
    	 int i=50;
    	 while(i>=1)
    	 {
    		 if(i%2==0) {
    			 System.out.println(""+i);
    		 }
    		 i--;
    	 }
     }
     static void dec1()
     {
    	 System.out.println("Odd numbers");
    	 int i=50;
    	 while(i>=1)
    	 {
    		 if(i%2!=0) {
    			 System.out.println(""+i);
    		 }
    		 i--;
    	 }
     }
     static void dec2()
     {
    	 System.out.println("Divisible by 3 numbers: ");
    	 int i=50;
    	 while(i>=1)
    	 {
    		 if(i%3==0)
    		 {
    			 System.out.println(""+i);
    		 }
    		 i--;
    	 }
     }
}
