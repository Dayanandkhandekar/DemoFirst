package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
	  
	  
	  
	  
	 
	  Student s1=new Student(1, "AA", 30);
	  
	  Student s5=new Student(5, "AA", 35);
	  
	  
	  Student s2=new Student(2, "BB", 40);
	  Student s3=new Student(3, "CC", 35);
	  Student s4=new Student(4, "DD", 37);
	  
	  List<Student> list=new ArrayList<Student>();
	  list.add(s1);
	  list.add(s5);
	  list.add(s2);
	  list.add(s3);
	  list.add(s4);
	  System.out.println("Befor Sorting list==="+list);
	 Collections.sort(list);
	  System.out.println("After list==="+list);
	  
	  Collections.sort(list,new SortByMark());
	  
	  System.out.println("After mark sort==="+list);
	  
	  System.exit(0);
	  
	  
	  // sorted set methods
	  // first  last  headSet  tailSet  subset  comparator
	  SortedSet<Integer> set=new TreeSet<Integer>();
	        set.add(10);
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(40);
	        System.out.println("set==="+set);
	        System.out.println("first==="+set.first());
	        System.out.println("last==="+set.last());
	        System.out.println("headset==="+set.headSet(25));//  element < 
	        System.out.println("tailSet===="+set.tailSet(21));//  >=element
	        System.out.println("subset===="+set.subSet(5, 21));  //  >=o1 and < o2 
	                 
}
}

class Student implements Comparable<Student> {
	
	int id;
	String sname;
	
	int mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", mark=" + mark + "]\n";
	}

	public Student(int id, String sname, int mark) {
		super();
		this.id = id;
		this.sname = sname;
		this.mark = mark;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return -(this.getId()-o.getId());// 1  2  2  1
		
		return -(this.getSname().compareTo(o.getSname()));
	}


	
	
	
	
}


class SortByMark implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.getMark()-o2.getMark());
	}
	
}

