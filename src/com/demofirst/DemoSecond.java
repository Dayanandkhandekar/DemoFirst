package com.demofirst;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSecond {
  public static void main(String[] args) {
	  Demo22.setDemo();
}
}

 class Demo11 {
	    // variable ---name given to memory location
	int a;//instance variable
	static int b;//  static variable 
	
	{
		int d=20;//local variable
		 System.out.println("Inside intsnace block"+d + " "+ a +" "+d);
	}
	
	static{
		Demo11 obj=new Demo11();
		 System.out.println("Inside static block"+obj.a +" "+b);
	}
	
	 void m1() {
		int d;//local variable
		System.out.println("Inside intsnace block" +a +" "+b);
		System.out.println("Inside intsnace method");
	}
	
	static void m2() {
		Demo11 obj=new Demo11();
		 System.out.println("Inside static block"+obj.a +" "+b);
		System.out.println("Inside static method");
	}
}
 
 class Demo22{
	 
	 {
		 Demo11 d=new Demo11();
		 System.out.println("Inside instance block"+d.a+" "+Demo11.b +" "+d.b);
	 }
	 
	static{
		 Demo11 d=new Demo11();
		 System.out.println("Inside instance block"+d.a + " "+Demo11.b);
	 }
	
	void m1() {
		 System.out.println("Inside instance method");
	}
	
	static void m2() {
		 System.out.println("Inside static method");
	}
	
	static void setDemo() {
		SortedSet<Integer> s=new TreeSet<Integer>();
		 s.add(10);
		 s.add(20);
		 s.add(30);
		 System.out.println(s.last());
		 System.out.println("==="+s.headSet(15));
		 System.out.println("t===="+s.tailSet(15));
	}
 }
