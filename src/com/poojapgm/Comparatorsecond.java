package com.poojapgm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparatorsecond {
	public static void main(String[] args) {
		//Object created from class
				ABC a1=new ABC(1,"Renu");
				ABC a2=new ABC(2,"Dhanu");
				ABC a3=new ABC(3,"Ashu");
				ABC a4=new ABC(4,"Supri");
				
				List<ABC>listabc=new ArrayList<ABC>();//list abc type chi
				listabc.add(a1);//object add method
				listabc.add(a2);
				listabc.add(a3);
				listabc.add(a4);
				System.out.println("Before sorting====="+listabc);
				Collections.sort(listabc,new SortById());   //first asel listabc parameter and second asel class abc cha no org constructor 
				                                              //object pass kela listabc, new abc() two object pass 
				System.out.println("After sorting===="+listabc);
	}
		
	}
	class ABC

	{
	int id;
	String name;
	//constructor
	/*
	* @param id
	* @param name
	*/
	public ABC(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	}

	//getter setter
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
	//To string
	@Override
	public String toString() {
	return "ABC [id=" + id + ", name=" + name + "]\n";
	}
	}


	class SortById implements Comparator<ABC> //new class create kela tymadhe implemenation kel comparator interface tymadhe write kela ABC as object
	{

		@Override
		public int compare(ABC o1, ABC o2) {
			// TODO Auto-generated method stub
			return-(o1.getId()-o2.getId());//- use for descending
		}
		public SortById()
		{
			
		}
		
	}

	/* notes- old class madhe  implementaion write karaych nahi new class create karych tymadhe implementation karych interface create karych.
	 *      -- jya class madhe implementation deto tych class madhe no org constructor pahije

	*/
