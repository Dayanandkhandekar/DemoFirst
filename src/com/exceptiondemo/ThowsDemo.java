package com.exceptiondemo;

public class ThowsDemo {
   public static void main(String[] args) {
	AAA.m1();
}
}

class AAA {
	
	static void m1() {
		try {
		int a=10/0;
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("===========");
			//throw new ArithmeticException("Arithmatic Exception Occurce Due num is divisible by zero===");
		    throw new UserUncheked("HIIII");
		}
		
		
	}
	
}

class UserUncheked extends RuntimeException{
	public UserUncheked(String s) {
		super(s);
	}
}
