package com.arohipgm;

import java.util.Scanner;

public class SmallerNumberFromArray {
	public static void main(String[] args) {
		GreaterNumberFromArray();
	}
	
	static void GreaterNumberFromArray() {
		int a[]=new int [5];       
		int smallernum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		 smallernum=a[0];
		for(int i=1;i<a.length; i++) {
			if(a[i]<smallernum) {
			 smallernum=a[i];
			}
		}
		System.out.println("Smaller Number From Array=="+smallernum);
	}

}
