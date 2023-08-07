package com.poojapgm;

import java.util.ArrayList;
import java.util.List;
public class Arraylistassignment {
	
	
	public static void main(String[] args) {
		addition();
		SumofEvenNumbers();
	    SumofoddNumbers();
		sumdiv4();
	}
	
	static void addition() {
		ArrayList<Integer>add1=new ArrayList();
		add1.add(10);
		add1.add(20);
		add1.add(30);
		add1.add(40);
		add1.add(50);
		int sum=0;
		for(int add:add1) {
			sum += add;
		}
		System.out.println("addition of all numbers="+sum);
		
	}
	static void SumofEvenNumbers() {
	ArrayList<Integer> numbers = new ArrayList();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	numbers.add(7);
	numbers.add(8);
	numbers.add(9);
	numbers.add(10);
	
	int sum=0;
	   for(int num:numbers) {
		   if(num%2==0) {
			   sum+=num;
		   }
	   }
	   System.out.println("Sum of Even Numbers :"+sum);
}

static void SumofoddNumbers() {
	ArrayList<Integer> numbers = new ArrayList();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	numbers.add(7);
	numbers.add(8);
	numbers.add(9);
	numbers.add(10);
	
	int sum=0;
	for(int num :numbers) {
		if(num%2!=0) {
			sum+=num;
		}
	}
	System.out.println("Sum of Odd Numbers :"+sum);
}
	
	static void sumdiv4() 
	{
		ArrayList<Integer>div=new ArrayList();
		div.add(1);
		div.add(2);
		div.add(3);
		div.add(4);
		div.add(5);
		div.add(6);
		div.add(7);
		div.add(8);
		div.add(9);
		div.add(10);
		
		int sum=0;
		for(int n1:div)
		{
			if(n1 % 4==0) {
				sum += n1;
			}
		}
		System.out.println("sum of all divisible by four="+sum);
	}

}
