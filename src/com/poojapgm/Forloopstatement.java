package com.poojapgm;

import java.util.Scanner;

public class Forloopstatement {
	
	public static void main(String[] args) {
		// even();
	     //odd();
		 div();
	}
	
	static void even()
	{
		int e;
		for(e=1;e<=50;e++)
		{
			if(e%2==0)
			{
				System.out.print(" "+e);
			}
		}
	}
	
	static void odd()
	{
		
		int o;
		for(o=1;o<=50;o++)
		{
			if(o%2!=0)
			{
				System.out.println(" "+o);
			}
		}
	}
	static void div()
	{
		int d;
		for(d=1;d<=50;d++)
		{
			if(d%3==0)
			{
				System.out.println(" "+d);
			}
		}
	}
	

}
