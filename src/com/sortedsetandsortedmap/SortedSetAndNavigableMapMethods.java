package com.sortedsetandsortedmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class SortedSetAndNavigableMapMethods {
     public static void main(String[] args) {
    	 //sortedSetMethods();
    	// sortedMap();
    	 navigableSetMethods();
    	// iteratorCursor();
    	// listIteratorDemo();
	}
     
     static void sortedSetMethods() {
    	 SortedSet<Integer> set=new TreeSet<Integer>();
    	    set.add(10);
    	    set.add(20);
    	    set.add(30);
    	    set.add(40);
    	    
    	     System.out.println("first===="+set.first());
    	     System.out.println("last===="+set.last());
    	     System.out.println("headeSet===="+set.headSet(15));
    	     
    	     System.out.println("tailSet===="+set.tailSet(10));
    	     
    	     System.out.println("subset===="+set.subSet(10, 30));
     }
     
     static void sortedMap() {
    	 SortedMap<Integer, String> set=new TreeMap<Integer, String>();
    	    set.put(10, "AA");
    	    set.put(20, "BA");
    	    set.put(30, "BA");
    	    set.put(40, "BA");
    	    set.put(50, "BA");
    	    
    	    System.out.println("firstkey====="+set.firstKey());
    	    System.out.println("lastKey====="+set.lastKey());
    	    System.out.println("headkey====="+set.headMap(12));
    	    System.out.println("tailkey====="+set.tailMap(10));
    	    System.out.println("submap====="+set.subMap(10, 30));
     }
     
     static void navigableSetMethods() {
    	 NavigableSet<Integer> nset=new TreeSet<Integer>();
    	 nset.add(10);
    	 nset.add(20);
    	 nset.add(30);
    	 nset.add(40);
 	    System.out.println("nset======="+nset);
 	    
 	   System.out.println("pollFirst======="+nset.pollFirst());
 	  System.out.println("nset======="+nset);
 	  
 	 System.out.println("pollLast======="+nset.pollLast());
 	 System.out.println("nset======="+nset);
 	 
 	 System.out.println("Celling====="+nset.ceiling(21));// >=obj  Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
 	 
 	 System.out.println("floor===="+nset.floor(22)); //  <=obj  Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
 	    
   System.out.println("higher===="+nset.higher(30)); // >obj  Returns the least element in this set strictly greater than the given element, or null if there is no such element.
     
   System.out.println("lower ====="+nset.lower(30));
     
     }
     
     
     
     static void iteratorCursor() {
    	 
    	 List<Integer> list=new ArrayList<Integer>();
    	   list.add(10);
    	   list.add(20);
    	   list.add(30);
    	   list.add(14);
    	   
    	     Iterator<Integer> itr = list.iterator();
    	      while(itr.hasNext()) {
    	    	  System.out.println("itr===="+itr.next());
    	    	  itr.remove();
    	      }
    	   System.out.println("list==="+list);
    	 
     }
     
     static void listIteratorDemo() {
    	    ArrayList<Integer> list=new ArrayList<Integer>();
  	       list.add(10);
  	        list.add(20);
  	       list.add(30);
  	      list.add(14);
  	     
  	        ListIterator<Integer> itr = list.listIterator();
  	         
  	        while(itr.hasPrevious()) {
  	        	System.out.println("itr===="+itr.previous());
  	        }
  	        
  	     Studet s1=new Studet(1,"AA");
  	   Studet s2=new Studet(2,"AA");
  	 Studet s3=new Studet(3,"AA");
  	 
  	 ArrayList<Studet> slist=new ArrayList<Studet>();
  	     slist.add(s1);
  	   slist.add(s2);
  	   slist.add(s3);
  	     
  	     ListIterator<Studet> sitr = slist.listIterator();
  	     
  	      while(sitr.hasPrevious()) {
  	    	  System.out.println(sitr.previous().getSid());
  	      }
       
     }
     
}

class Studet {
	  int sid;
	  String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Studet [sid=" + sid + ", sname=" + sname + "]";
	}
	public Studet(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	  
	  
}
