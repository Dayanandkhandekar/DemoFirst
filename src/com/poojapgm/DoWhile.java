package com.poojapgm;

public class DoWhile {
	
	public static void main(String[] args) {
		even();
		even1();
		even2();
	}
	static void even()
	{
		System.out.println("Even Numbers");
		int i=1;
		do {
			if(i%2==0) {
				System.out.println(""+i);
			}
			i++;
		}
		while(i<=50);
	}
	static void even1()
	{
		System.out.println("Odd Numbers");
		int i=1;
		do {
			if(i%2!=0) {
				System.out.println(""+i);
			}
			i++;
		}
		while(i<=50);
	}
	static void even2()
	{
		System.out.println("Print all numbers Divisiable by 3:");
		int i=1;
		do {
			if(i%3==0) {
				System.out.println(" "+i);
			}
			i++;
		}
		while(i<=50);
	}
	

}
