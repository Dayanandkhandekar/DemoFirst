package com.poojapgm;

import java.util.Scanner;

public class Ifelseassignment {
	
	public static void main(String[] args) {
		assign();
	}
      static void assign()
      {
    	  System.out.println("Enter your choice");
    	  Scanner s1=new Scanner(System.in);
    	  int choice=s1.nextInt();
    	  if(choice==1)
    	  {
    		  System.out.println("Enter Year");
    		  int year=s1.nextInt();
    		  if(year%4==0)
    		  {
    			  System.out.println("Year is Leap");
    		  }
    		  else
    		  {
    			  System.out.println("Year is not a leap");
    		  }
    	  }
    	  else if(choice==2)
    	  {
  			System.out.println("enter number");
  			int n=s1.nextInt();
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
    	  
    	  else if(choice==3)
    	  {
    		 System.out.println("enter number"); 
    		 int n=s1.nextInt();
    		 int i;
    		 int fact=1;
    		 for(i=1;i<=n;i++)
    		 {
    			 fact=fact*i;
    		 }
    		 System.out.println("factorial number is =="+fact);
    		 
    	  }
    	  else if(choice==4)
    	  {
    		  int n1=0,n2=1,n3,i,count=10;
    		  System.out.println(n1+" "+n2);
    		  for(i=2;i<count;++i)
    		  {
    			  n3=n1+n2;
    			  System.out.println(""+n3);
    			  n1=n2;
    			  n2=n3;
    		  }
    	  }
    	 
    	  
      }
}
