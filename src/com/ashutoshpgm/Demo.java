package com.ashutoshpgm;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	W.m1();
}
}
class W {
	static void m1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int odd=0;
		int even=0;
		int fact =1;
		boolean flag=false;
		do {
			System.out.println("1.evenodd 2.factorial 3.prime number 4.divisible by 4 ");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				if (num %2==0)
					System.out.println("even number");
				else
					System.out.println("odd number");
				break;
			case 2:
				for(int i = 1;i<=num;i++);
				{ int i = 0;
				fact=fact*i;
				}
				
				System.out.println("factorial is==="+fact);
				break;
				case 3:
					if(num==1 || num==2 || num==3 || num==5 || num==7)
					{System.out.println("yes prime number======"+num);}
					else if(num % 2 > 0 && num % 3>0 && num%5>0 && num%7>0)
					{System.out.println("prime number");}
					else
						System.out.println("not prime number");
					break;
				case 4:
					if(num % 4==0)
					System.out.println("yes it's divisible by 4");
					else
						System.out.println("not divisible by 4");
					break;
				default:
					System.out.println("invalid choice");
				
			}System.out.println("Do u want continoue====");
			String msg=sc.next();//y
			if(msg.equalsIgnoreCase("y")) {
				flag=true;
			}else {
				flag=false;
			}
		}while(flag);
		System.out.println("====EOP====");
		}
	}
