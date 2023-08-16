package com.poojapgm;

public class MethodOverload {

	public static void main(String[] args) {
		
		//Byte--> Short-->Int-->Long-->Float-->Double//
		
		A1 a=new A1();
		a.add();
		a.add(5);	
		a.add(4.5672);
		a.add(4568,9685);

	}	
	}
	class A1 {
		void add() {
			System.out.println("No Parameter");
		}
		
		void add(int a) {
			System.out.println("Single int Parameter");
		}
		
		void add(int b, int a) {
			System.out.println("Double int Parameter");
		}
		
		void add(float a) {
			System.out.println("single Float Parameter");
		}
		
		void add(float a,int b) {
			System.out.println("float int parameter");
		}
		
		void add(int a,float b) {
			System.out.println("int float parameter");
		}
		
		void add(double a) {
			System.out.println("single double parameter");
		}
		
		void add(Integer a) {
			System.out.println("single integer parameter");
		}
		
		void add(Number a) {
			System.out.println("single number parameter");
		}
		void add(Object a) {
			System.out.println("Object parameter");
		}
		
	}

