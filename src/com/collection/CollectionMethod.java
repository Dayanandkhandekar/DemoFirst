package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionMethod {
public static void main(String[] args) {
	W.m1();
	
}
}
class W{
	 static void m1(){
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter your size");
			int num=sc.nextInt();
			List<Integer> list=new ArrayList();
			boolean flag=false;
			do {
				System.out.println("Enter Number");
				int userNum=sc.nextInt();
				if(list.size()< num ) {
					list.add(userNum);
					flag=true;
				}else {
					flag=false;
					System.out.println("List is full now");
				}
				
			}while(flag);
			System.out.println("list===="+list);
			int sum=0;
			for(int numm:list) {
				if(numm%2==0) {
					sum=sum+numm;
				}
			}
			
			System.out.println("sum===="+sum);
		 
	 }
}