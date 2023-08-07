package com.poojapgm;

public class Loopexp {
	
	public static void main(String[] args) {
		//forloop1();
		//forloop2();
		//whileloop1();
		//whileloop2();
		//dowhile1();
		dowhile2();
	}
	static void forloop1()
	{
		System.out.println("Forward");
		for(int a=1;a<=20;a++)
		{
			System.out.println(" "+a);
		}
	}
	
	static void forloop2()
	{
		System.out.println("Backward");
		for(int a=20;a>=1;a--)
		{
			System.out.println(" "+a);
		}
	}
	
	static void whileloop1()
	{
		System.out.println("forward");
		int i=1;
		while(i<=20) {
			System.out.println(""+i);
			i++;
		}
	}
	
	static void whileloop2()
	{
		System.out.println("backward");
		int i=20;
		while(i>=1) {
			System.out.println(" "+i);
			i--;
		}
	}
	static void dowhile1()
	{
		System.out.println("forward");
		int i=1;
		do {
			System.out.println(" "+i);
			i++;
		}
		while(i<=50);
	}
	static void dowhile2()
	{
		System.out.println("backward");
		int i=50;
		do
		{
			System.out.println(" "+i);
			i--;
		}
		while(i>=1);
	}

}
