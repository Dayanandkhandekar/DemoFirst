package com.poojapgm;

import java.util.Scanner;

public class Primeno {
	
	public static void main(String[] args) {
		prime();
	}
 
	static void prime()
	{
		//Prime number manje one ne ani tych number ne divide houn baki zero ali pahije
		//e.g 7 --> prime number
		
		int count=0;
		System.out.println("Enter Any Number:");
	//runtime madhe input value karysathi java madhe scanner class use karun tycha object create
		Scanner r= new Scanner(System.in);
		int n=r.nextInt();//object reference nextint  gheun variable madhe store keli jate
		for(int i=1;i<=n;i++)  //i=1;1<=7;i++  i=1,2,3
		{
			if(n%i==0)         //(7%1==0)
			{
				count++;        //count=1
			}
		}
		if(count==2)  //2==2  true  asel first line excute 
		{  
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}
}
