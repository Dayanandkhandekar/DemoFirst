package com.arbajpracticepgm;
import java.util.HashMap;
public class MapAssignPgmDemo {
 public static void main(String[] args) {
          Add();
	}
 static void Add () {
	String value = "AACCADBBEEC";     //declared String value    
	 
	HashMap<Character, Integer> charCounts=new HashMap<Character, Integer>(); //HashMap is declared
	 
	 char[]Stringvalue = value.toCharArray(); //stringvalue is converted into CharArray
	 
	  for(char c: Stringvalue) {   //for each loop is used for reading Stringvalue
		                          //char data type is declared and value of Array is stored into c variable
	
		  if(charCounts.containsKey(c)){ //after that if statement is used and given condition inside 
			                            //and contains key is used for checking character 

			charCounts.put(c, charCounts.get(c)+1 ); // Added put method and incremented by 1
		  }
		  else {
			  charCounts.put(c, 1); // If character dosen't exist then put 1
		  }
	  }
	  System.out.println("Characters=="+charCounts);   //print characters
		
	
 
 
 }
}



