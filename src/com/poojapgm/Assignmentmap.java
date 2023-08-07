package com.poojapgm;

import java.util.HashMap;
import java.util.Map;

public class Assignmentmap {

	public static void main(String[] args) {
		 
		 add1();
		}
		static void add1() {
		String value="pooja";
		HashMap<Character, Integer> charCounts=new HashMap<Character, Integer>();//HashMap declare kele
		char[] stringvalue= value.toCharArray(); // string value he char array madhe declare keli
		for(char c: stringvalue) { // string value read karnya sathi for each loop cha use kela
		 // yachya madhe char data type declare karun c ya variable madhe strore keli aahe array chi vaule
		if(charCounts.containsKey(c)) { // ntr if statement cha use karun tya madhe condition dili ahe contains key cha use kela aahe 
		 //character check karnya sathi 
		charCounts.put(c, charCounts.get(c)+1); //put method ne add karun 1 ne incremenent kele aahe
		}else {
		 charCounts.put(c, 1); // ani jr nasel character nasel tr 1 put honar
		 }
		}
		System.out.println("character="+charCounts);
		}
		
}
