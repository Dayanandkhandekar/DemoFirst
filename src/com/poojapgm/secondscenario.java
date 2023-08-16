package com.poojapgm;

import java.util.HashSet;
import java.util.Set;
import java.util.Set;


public class secondscenario {
	
	

	public static void main(String[] args) {
		//object created 
		students s1=new students(1,"abcd");
		students s2=new students(1,"abcd");
		students s3=new students(2,"efgh");
		students s4=new students(1,"abc");
		
		Set<students> set=new HashSet<students>();
		//set madhe add method 
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("s1======"+s1.hashCode());//memory location
		System.out.println("s2======"+s2.hashCode());
		System.out.println("s3======"+s3.hashCode());
		System.out.println("s4======"+s4.hashCode());
		System.out.println("set==="+set);
		
	}
}
	class students {
		int id;
		String name;
		
		//constructor
		public students(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
			
		}

        //to string
		@Override
		public String toString() {
			return "students [id=" + id + ", name=" + name + "]";
		}
		
		
	}

       /* notes-----------ya case madhe  hashcode object kade ani equal user kde ahe.hashcode object manje user define class  override
                           (kiva write) kele nahi tymule te memory location madhe fail hoel  ani different bucket location yeil .
                            tymule te equal kade janar nahi fail hoel.
                            display hotana all records hotil.
                 */           
