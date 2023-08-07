package com.poojapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparabledemo {
	public static void main(String[] args) {
		comparable();
	}
	
static void comparable()
{
	stud2 s1=new stud2(1,"abc",70); //object created
	stud2 s2=new stud2(2,"def",60);
	stud2 s3=new stud2(3,"ghi",80);
	stud2 s4=new stud2(4,"jkl",66);
	stud2 s5=new stud2(5,"abc",74);
	
	List<stud2>liststud2=new ArrayList<stud2>();
	liststud2.add(s1);
	liststud2.add(s5);
	liststud2.add(s2);
	liststud2.add(s3);
	liststud2.add(s4);
	
	System.out.println("Before liststud2======"+liststud2);
	Collections.sort(liststud2);
	System.out.println("After liststud2=====" + liststud2);
}
}
	class stud2 implements Comparable<stud2> //class implement karun comparable interface create kela to stud2 typech asel  
{
	int id;
	String stud2name;
	int marks;
	
	/**
	 * @param id
	 * @param stud2name
	 * @param marks
	 */
	public stud2(int id, String stud2name, int marks) {
		super();
		this.id = id;
		this.stud2name = stud2name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "stud2ent [id= " + id + ", stud2name= " + stud2name + ", marks= " + marks + "]\n";
	}

	
	
	//comparable chi method compare to
	@Override
	public int compareTo(stud2 o) {
		// TODO Auto-generated method stub
	int res= this.getstud2name().compareTo(o.getstud2name());//stud2 name compare karun eka variable madhe store karun ghtle
	if(res==0) //if chya condition madhe res==0 asel tr asencending pramane  list display hoel
	{
		return this.getId()-o.getId();
	}
	else
	{
		return-(this.getId()-o.getId());//nasel tr descending pramane list display hoel(return- =des )
	}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getstud2name() {
		return stud2name;
	}

	public void setstud2name(String stud2name) {
		this.stud2name = stud2name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
