package com.poojapgm;

import java.util.Scanner;

public class Evenorodd {
	
	public static void main(String[] args) {
		evenorodd();
	}
	static void evenorodd()
	{
		Scanner s=new Scanner(System.in);   // scanner class use karun object create
		System.out.println("Enter The Number:"); //message pass
		int n=s.nextInt();    //variable n madhe integer value store (scanner method use karun)//
		if(n%2==0)  // number chi baki 2 ne divide karun 0 yet asel tr first line execute otherwise else line executed
		{
			System.out.println("Even Number");//condition true
		}
			else 
			{
				System.out.println("Odd Number");//condition false
			}
		}
		
	}

