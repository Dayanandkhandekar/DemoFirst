package com.poojapgm;

public class ConstructorChainingDemo {
	
	public static void main(String[] args) {
		 B b=new B();
	}

}
class A
{
	public A()
	{
		this(10,20);
		System.out.println("Inside A no arg");
	}
	public A(int a)
	{
		this();
		System.out.println("inside A Single arg");
	}
	public A(int a, int b) {
		System.out.println("inside A Double arg");
	}
}
class B extends A
{
	public B()
	{
		this(10);
		System.out.println("inside B no arg");
	}
	public B(int a)
	{ 
		this(10,0);
		System.out.println("inside B single arg");
	}
	public B(int a, int b) 
	{
		super(10);
		System.out.println("inside B Double arg");
	}
}