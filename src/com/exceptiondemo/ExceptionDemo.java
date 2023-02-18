package com.exceptiondemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

public class ExceptionDemo {
     public static void main(String[] args) throws CloneNotSupportedException {
    	
    	 
    	 
    	 Exception1.m1();
    	 System.exit(0);
    	 
    	 A a=new A(1,"AA");
		  A  a2 = (A) a.clone();
		  
		  //int num= 10/0; AE 
		 // String s=null;
		 //  s.length(); NE
		   
		    String s1="123";
		    int digit=Integer.parseInt(s1);
		    
		    System.out.println("digit======="+digit);
		    
		    String s2="123abc";
		    //int digit1=Integer.parseInt(s2); NumberFormatException
		    
		    //System.out.println("digit1======="+digit1);
		    
		    int array[]=new int[2];
		    
		    array[0]=10;
		    array[1]=20;
		    array[2]=20;
		    System.out.println("hiii");
		    
		    
    	 
	}
}

class A  implements Cloneable{
	int id;
	String name;
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 
}

class Exception1{
	
	static void m1()  throws ArithmeticException {
		System.out.println("===111============");
		System.out.println("===1112============");
		System.out.println("===1113============");
		System.out.println("===1114============");
		int num=10/0;
		System.out.println("===1115============");
		System.out.println("===1116============");
		
		throw new ArithmeticException();
	}
	
	
	
}
