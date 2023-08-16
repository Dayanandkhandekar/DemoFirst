package com.poojapgm;

public class WhileLoop {
	
	public static void main(String[] args) {
		even();
		even1();
	    even2();
	}
	
	static void even()
	{
		System.out.println("Even Numbers:");
		int i=1;
		while(i<=50)
		{
			if(i%2==0) {
				System.out.println(""+i);
			}
		i++;
		}
	}
	static void even1()
	{
		System.out.println("Odd Numbers:");
		int i=1;
		while(i<=50) {
			if(i%2!=0) {
				System.out.println(""+i);
			}
			i++;
		}
	}
	static void even2()
	{
		System.out.println("Print all numbers is Divisible is Divisible by 3:");
		int i=1;
		while(i<=50) {
			if(i%3==0) {
				System.out.println(""+i);
			}
			i++;
		}
	}
	
}
