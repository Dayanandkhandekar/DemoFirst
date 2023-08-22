 package com.ashutoshpgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortedSet {
public static void main(String[] args) {
	student e1=new student(1,"abc",5);
	student e2=new student(2,"abcd",7);
	student e3=new student(3,"abce",9);
	student e4=new student(4,"abc",3);
	
	List<student> student1=new ArrayList<>();
	student1.add(e1);
	student1.add(e2);
	student1.add(e3);
	student1.add(e4);
	
	System.out.println("stulist==="+student1);
	Collections.sort(student1);
	System.out.println("after sorting stulist==="+student1 );
}
}


class student implements Comparable<student>{
	int id;
	String name;
	double std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getStd() {
		return std;
	}
	public void setStd(double std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", std=" + std + "]\n";
	}
	public student(int id, String name, double std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}
	@Override
	public int compareTo(student o) {
		
		return (int) (this.getStd()-o.getStd());//
	}
	
	
	
}