package com.poojapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Interviewassign {
	public static void main(String[] args) {
		comparable();
	}

	static void comparable() {
	 student s1=new student(1,"abc",70);
	 student s2=new student(2,"cde",80);
	 student s3=new student(3,"efg",90);
	 student s4=new student(4,"hij",85);
	 student s5=new student(5,"kln",64);
	 
	 List<student> listset=new ArrayList<student>();
	 listset.add(s1);
	 listset.add(s2);
	 listset.add(s3);
	 listset.add(s4);
	 listset.add(s5);
	System.out.println("Before sorting======="+listset);
	Collections.sort(listset);
	System.out.println("After sorting======"+listset);
	 
	}	 
	 
}

class student implements Comparable<student>{
	int id;
	String sname;
	int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/**
	 * @param id
	 * @param sname
	 * @param marks
	 */
	public student(int id, String sname, int marks) {
		super();
		this.id = id;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", sname=" + sname + ", marks=" + marks + "]\n";
	}
	@Override
	public int compareTo(student o) {
	return-(this.getMarks()-o.getMarks());
	}
	
	
}