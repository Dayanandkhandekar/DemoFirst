package com.setdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
	// primitive cha apan object nahi bnvu shekat  int a=new int();
	  // we can access static fileds without object creation
	  //Student.SortedSetDemo();
	  A.m1();
	  System.exit(0);
	  
	  Set<Student> studentSet=new HashSet<Student>();
	  Student s1=new Student(1,"AA");
	  System.out.println("s1 hashcode=="+s1.hashCode());
	  Student s2=new Student(1,"AA");
	  System.out.println("s2 hashcode=="+s2.hashCode());
	  Student s3=new Student(3,"CC");
	  Student s4=new Student(1,"BB");
	  System.out.println("s3 hashcode=="+s3.hashCode());
	  studentSet.add(s1);
	  studentSet.add(s2);
	  studentSet.add(s4);
	  studentSet.add(s3);
	 
	  System.out.println("slist======="+studentSet);
	  
	
	
	HashMap<Integer, String> hmap=new HashMap<Integer, String>();
	        hmap.put(10,"AA");
	        String oldvalue=hmap.put(10,"BB");
	        System.out.println("oldvalue===="+oldvalue);
	        System.out.println("map===="+hmap);
	  
	
}
}

class Student {
	
	  int studentId;
	  String studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	
	
	
	
	
	static void SortedSetDemo() {
		
		Set hs=new HashSet();
		hs.add(10);
		hs.add("abc");
		hs.add(10.0);
		hs.add(10.0f);
		
		
		Set<Integer> hs1=new HashSet<Integer>();
		 hs1.add(10);
		
		 
		
		SortedSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(6);
		
		System.out.println("fist=="+set.first());
		System.out.println("fist=="+set.last());
		
		System.out.println("headSet=="+set.headSet(11));  // obj < element
		System.out.println("tailSet==="+set.tailSet(10));// elemt >=obj
		
		System.out.println("Subset===="+set.subSet(5, 10));// obj >=elemnt  and  10 <
		
	}
	 
	 
	

	
	
	  
	  
}


class A {
	
	  static  void m1() {
		   
		   Set<Integer> set =new HashSet<Integer>();
		      set.add(10);
		      set.add(10);
		      set.add(20);
		      set.add(30);
		      
		      System.out.println("set======="+set);
		      
		      Map<Integer, String> map=new HashMap<Integer, String>();
		           map.put(10,"aa");
		           map.put(10,"bb");
		           map.put(20,"caa");
		           map.put(30,"daa");
		           
		           System.out.println("map======="+map);
		    
	   }
	 
}


