package com.poojapgm;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigablesetmethod {
	
	
	public static void main(String[] args) {
		
	NavigableSet<Integer>naviset=new TreeSet<Integer>();
	naviset.add(10);
	naviset.add(20);
	naviset.add(30);
	naviset.add(40);
	naviset.add(50);
	
	System.out.println("Naviset======="+naviset);
	
	System.out.println("PollFirst========"+naviset.pollFirst());//first element print honar
	
	System.out.println("PollLast========="+naviset.pollLast());//Last element print honar
	
	System.out.println("Ceiling==========="+naviset.ceiling(10));//return greater element(je element pass kele ahe )
	/*>=obj  Returns the greater than or equal to the given element, or null if there is no such element.*/
	
	System.out.println("Floor============"+naviset.floor(35));//return less than element
	/*<=obj  Returns the greatest element in this set less than or equal to the given element, or null if there is no such element. */
	
	System.out.println("Higher============"+naviset.higher(30));//return greater element
	/*>obj  Returns  greater than the given element, or null if there is no such element.*/
	
	System.out.println("Lower=============="+naviset.lower(30));//return less than element 
	/*>obj  Returns  greater than the given element, or null if there is no such element.*/
	
	System.out.println("Descending Set============="+naviset.descendingSet());//return reverse order elements first and last sodun
	/*Returns a reverse order view of the elements contained in this set*/
	
	System.out.println("Headset=========="+naviset.headSet(40));//return small elements
	/*Returns a view of the portion of this set whose elements are strictly less than toElement.*/
	
	System.out.println("Subset==========="+naviset.subSet(15, 35));//return krte 15 te 35 madhil elements
	/*Returns a view of the portion of this set whose elements range from fromElement to toElement*/
	
	System.out.println("Tailset==========="+naviset.tailSet(25));//return krte 25 ntr che greater elements
	/*	Returns a view of the portion of this set whose elements are greater than or equal to fromElement.*/
	
	System.out.println("Iterator============"+naviset.iterator());
	
	}
}
