package com.poojapgm;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
	
	
	public static void main(String[] args) {
		SortedSet<Integer>set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println("First====="+set.first()); //first element ahe to print hoel
		
		System.out.println("Last======"+set.last());//last element print hoel
		
		System.out.println("Subset======"+set.subSet(10, 45));//subset cha use start -last end point (source-Destination)
		                                                      //start and last madhil element display krtat(start element include kartat)
		
		System.out.println("HeadSet======"+set.headSet(25));//jo element pass kela ahe to greater samjala jato typeksha less element 
		                                                     //  display hotat(jo element apan dila ahe to include kela jat nahi.)
		
		System.out.println("Tailset======="+set.tailSet(30));//jo element pass kela ahe tyla small samjl jaat ani include kele jate
		                               //typeksha greater display kele jate
		
	}

}


