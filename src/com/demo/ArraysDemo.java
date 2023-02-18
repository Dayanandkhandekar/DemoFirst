package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ArraysDemo {
   public static void main(String[] args) {
	  
	  List<Integer> list=new ArrayList<Integer>();
	   list.add(10);
	   list.add(20);
	  
	   
	   System.out.println("size==="+list.size());
	  
	   
	   Collections.synchronizedList(list);
	   
	  Vector<Integer> v=new Vector<Integer>();
	   v.add(10);
	   v.add(20);
	   v.add(30);
	   v.add(40);
	   v.addElement(20);
	   
	    v.elementAt(1);
	     v.get(1);
	   
	   
	     
	     Stack<Integer> stack=new Stack<Integer>();// push ,pop,peek
	     stack.add(10);
	     stack.push(20);
	     stack.push(30);
	     stack.push(40);
	   //  System.out.println("stack==="+stack);
	     stack.pop();
	    // System.out.println("After pop stack==="+stack);
	     //
	     //System.out.println(" peek stack==="+stack.peek());
	     
	    // System.out.println("After peek stack==="+stack);
	     stack.remove(2);
	     
	     //System.out.println("After remove stack==="+stack);
	 
	   
	     
	// Demo.m1();
	    Demo.m2();
}
}

class Demo {
	 
	static  void m1() {
		  Scanner s=new Scanner(System.in);
		   System.out.println("Enter array Size "); 
		   int sizeArray=s.nextInt();
		   int index=0;
		   int count= 0;
		   
		   int array[]=new int[sizeArray];
		 
		   boolean falg=false;
		   
		   do {
		   System.out.println("leng==="+array.length);
		   
		   switch (1) {
		case 1:
			     System.out.println("Enter element");
			      int num=s.nextInt();
			      if(count <array.length ) {
			    	  array[index]=num;
			    	  index++;
			    	  count++;
			      }else {
			    	  //  0  1
			    	  //  10  20 
			    	  System.out.println("array Size full Now=="+Arrays.toString(array));
			    	  array =Arrays.copyOf(array, array.length+2);
			    	  array[index]=num;
			    	  index++;
			    	  count++;
			    	  System.out.println("array =="+Arrays.toString(array));
			      }
			      
			break;

		
		         }
		   System.out.println("Do you want continoue..");
		   String msg=s.next();
		   if(msg.equalsIgnoreCase("y")) {
			   falg=true;
		   }else {
			   falg=false;
		   }
		   }while(falg);
		       
		   
		 
	 }
	
	static void m2() {
		
		 int array[]=new int[7];
		 
		 array[0]=10;
		 array[1]=7;
		 array[2]=6;
		 array[3]=10;
		 array[4]=9;
		 array[5]=8;
		 int add=0;
		 int count=1;
		 int no1=0;
		 int no2=0;
		 
		 
		 for(int i=0; i< array.length;i++) {
			int num =array[i];
			add=add+num;
			
			if(count ==1) {
				 no1=array[i];
				 count++;
			}else if(count == 2) {
				no2=array[i];
				System.out.println("add==="+add);
				  if(add % 2 > 0) {
					  //  array     0   1
					  //           10   7
					  // no1=10  no2=7                  7   10         
					  //
					  array[i]=no1;
					  array[i-1]=no2;
					  count=1;
					  add=0;
				  }else {
					  array[i-1]=no1;
					  array[i]=no2;
					 // array[i]=0;
					  count=1;
					add=0;
				  }
			}
			
			
		 }
		 
		 System.out.println("Arrays after add==="+Arrays.toString(array));
		 
	}
	 
}



