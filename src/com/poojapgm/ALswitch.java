package com.poojapgm;

import java.util.ArrayList;
import java.util.Scanner;
public class ALswitch {
	
	public static void main(String[] args) {
		method();
	}
	
	static void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your size");
		int size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList();
		 boolean flag= false;
		do{
			System.out.println("1. Add Element  2. check Operation");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
		switch(choice) {
		case 1:
				int asize=list.size();
				 if(asize<size) {
					 System.out.println("enter your element");
					 int element =sc.nextInt();
					 list.add(element);
				 }else {
					 System.out.println("collection is full now");		 }
		break;
		case 2:
				System.out.println("1.Sum of Even Numbers  2. Sum of Odd Numbers  3. Sum of Numbers");
				System.out.println("Select Operation");
				int operation=sc.nextInt();
				if(operation==1) {
					ArrayList<Integer> numbers = new ArrayList();
					numbers.addAll(list);
					int sum=0;
					   for(int num:numbers) {
						   if(num%2==0) {
							   sum+=num;
						   }
					   }
					   System.out.println("Sum of Even Numbers :"+sum);
				}
				else if(operation==2) {
					ArrayList<Integer> numbers = new ArrayList();
					numbers.addAll(list);
					int sum=0;
					for(int num :numbers) {
						if(num%2!=0) {
							sum+=num;
						}
					}
					System.out.println("Sum of Odd Numbers :"+sum);
				}
				else if(operation==3) {
					ArrayList<Integer> numbers = new ArrayList();
					numbers.addAll(list);
					int sum = 0;
					for (int number : numbers) {
					    sum += number;
					}

					System.out.println("Sum: " + sum);

				}
		break;
		default:
		break;
			}
		            System.out.println("Do You Want to continue");
	                	String msg=sc.next();
		            if(msg.equalsIgnoreCase("yes")) {
		                 	flag=true;
		              }else {
			        flag=false;
		            }
	               	}while(flag);
		
	             	System.out.println("======End of Program====");
	         }
	}

