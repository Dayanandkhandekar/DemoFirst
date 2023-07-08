package com.arohipgm;

import java.util.Scanner;

public class GreaterNumberFromArray {
	public static void main(String[] args) {
		GreaterNumberFromArray();
	}
	
	static void GreaterNumberFromArray() {
		int a[]=new int [5];  // array declare kele size=5
		int greaternum;
		Scanner sc=new Scanner(System.in);//run time la value ghenya sathi scanner class cha use kele
		System.out.println("Enter Array Elements");
		for(int i=0;i<5; i++) {// ani for loop cha
			a[i]=sc.nextInt();
		}
		 greaternum=a[0];      // array chya 0th position la ji value yeil tyala greaternum ya variable madhe store kele
		for(int i=1;i<5; i++) { // i chi value hi 1 pasun start keli 0 he already store kele aahe comparison sathi
			if(a[i]>greaternum) {//i chi value hi greaternum peksha mothi asel tr 
			 greaternum=a[i];// graternum ya variable madhe strore honar
			}
		}
		System.out.println("Greater Number From Array=="+greaternum);//greaternum print hoil
	}


}

/*
 * output:
 * Enter Array Elements
10 20 30 40 50 
Greater Number From Array==50
* 
 */
