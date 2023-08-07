package com.poojapgm;

import java.util.Scanner;

public class IfelseifStatement {
	
	public static void main(String[] args) {
		s1();
	}

	static void s1() {
		System.out.println("enter your choice");
		Scanner c1=new Scanner(System.in);
		int choice=c1.nextInt();
		if(choice==1)
		{
			System.out.println("enter first number");
			int n1=c1.nextInt();
			System.out.println("enter second number");
			int n2=c1.nextInt();
			int result=n1+n2;
			System.out.println("addition=="+result);
		}
		else if(choice==2) {
			System.out.println("enter number");
			int no1=c1.nextInt();
			if(no1%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		else if(choice==3)
		{
			System.out.println("enter number");
			int n=c1.nextInt();
			int i;
			int m=0;
			int flag=0;
			 m=n/2;
			for(i=2;i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println("number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("number is prime");
			}
		}
			else
			{
				System.out.println("Invalid choice");
			}
		}
		
}
