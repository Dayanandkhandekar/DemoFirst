package com.ashutoshpgm;

public class Overriding {
public static void main(String[] args) {
	B Q=new B();
	c P=new c();
	B R=new c();
	
	Q.m1();
	Q.m2();
	R.m1();
	R.m2();
}
}
class B {
	void m1() {
		System.out.println("parent class");
		
	}
	float m2() {
		System.out.println("inside parent class");
		return 0;
		
	}
}
class c extends B {
	void m1() {
		System.out.println("child method");
		
	}
	float m2() {
		System.out.println("method overriding");
		return 0;
		
		
	}
	class d extends c {
		void m1() {
			System.out.println("child class 1");
			
		}
		void m3() {
			System.out.println("child class 2");
		}
	}
}