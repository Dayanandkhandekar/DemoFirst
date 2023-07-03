package com.jayfirstdemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class StringCount {
	
	
	public static void CountOccurance(String str) {
		Map<Character, Integer> m = new HashMap<Character,Integer>();
	
		char strArray[] = str.toCharArray();     //converted string to char array
	
		for (char c : strArray) {    //for each loop for iteration
	 
			if (m.containsKey(c)) {   //checking condition character cantain or not
	    
				m.put(c, m.get(c) +1);  //if already char contain in arr then increament by 1
	    	 
			
		} else {
			m.put(c, 1);   //if not contain in arr then put as first 1
		}
		}
			System.out.println(str + ":" + m); //occurance will display
		}
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);     
			 System.out.println("Enter first string : ");
			 String strArray= sc.next();
              StringCount s = new StringCount();
              s.CountOccurance(strArray);;

			//CountOccurance("tdhdhussg");
			//CountOccurance("hddyd dhgdfyy");
			
		}
		
		
	}

/*Output:
Enter string : 

abbcccddddddeee

abbcccddddddeee:{a=1, b=2, c=3, d=6, e=3}*/