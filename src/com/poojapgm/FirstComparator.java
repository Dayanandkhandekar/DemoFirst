package com.poojapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstComparator {
	public static void main(String[] args) {
		

	//Object created from class
			pvu a1=new pvu(1,"Renu");
			pvu a2=new pvu(2,"Dhanu");
			pvu a3=new pvu(3,"Ashu");
			pvu a4=new pvu(4,"Supri");
			
			List<pvu>listpvu=new ArrayList<pvu>();//list abc type chi
			listpvu.add(a1);//object add method
			listpvu.add(a2);
			listpvu.add(a3);
			listpvu.add(a4);
			System.out.println("Before sorting====="+listpvu);
			Collections.sort(listpvu, new pvu());   //first asel listabc parameter and second asel class abc cha no org constructor 
			                                        //object pass kela listabc, new abc() two object pass 
			System.out.println("After sorting===="+listpvu);
		}

	}
	class pvu implements Comparator<pvu> //class madhe implement karaych comparator interface abc type ch ntr abc class name vr jaun
	                                      //abc vr add unimplemented method karych compare to yete
	{
		int id;
		String name;
		//constructor
		/*
		 * @param id
		 * @param name
		 */
		public pvu(int id, String name) {
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
			return "abc [id=" + id + ", name=" + name + "]\n";
		}

		//compare two parameter //this keyword use karaych nahi
		@Override
		public int compare(pvu o1, pvu o2) {
		
			return-(o1.getId()-o2.getId());//- use for descending
		}
		public pvu()// no org constructor 
		{
			
		}
		
	}



	/*notes- same class madhe implementation karych adhi ntr no org() constructor
	 *  -- jya class madhe implementation deto tych class madhe no org constructor pahije
	   */

