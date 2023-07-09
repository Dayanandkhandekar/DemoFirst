package com.jayfirstdemo;

import java.util.Arrays;

public class MockInterviewQuestion {

	public static void main(String[] args) {
		ArrayDemo.arrayDemo();
	}

}
class ArrayDemo{
	static void arrayDemo() {
		
		int sum = 0;
		int array1[]=new int[10];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		array1[4]=50;
		array1[5]=60;
		array1[6]=70;
		array1[7]=80;
		array1[8]=90;
		array1[9]=100;
		System.out.println("array1"+Arrays.toString(array1));
		System.out.println(array1.length);
		
	    for (int i = array1.length-1; i >=0; i--) {
			
			 
			 System.out.println("Reverse=="+array1[i]);
			
			 sum=sum+array1[i];
			 
			System.out.println("Sum=="+sum);
			 
			
		}

		}
		
	}
	
/**
 * OUTPUT:
 * 
 * array1[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
10
Reverse==100
Sum==100
Reverse==90
Sum==190
Reverse==80
Sum==270
Reverse==70
Sum==340
Reverse==60
Sum==400
Reverse==50
Sum==450
Reverse==40
Sum==490
Reverse==30
Sum==520
Reverse==20
Sum==540
Reverse==10
Sum==550

 * 
 * /
 */