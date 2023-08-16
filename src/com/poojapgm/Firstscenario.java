package com.poojapgm;

import java.util.HashSet;
import java.util.Set;

public class Firstscenario {
	
	public static void main(String[] args) {
		//class che object create (id and name)
		studentd s1=new studentd(1,"abcd");
		studentd s2=new studentd(1,"abcd");
		studentd s3=new studentd(2,"efgh");
		studentd s4=new studentd(1,"abc");
		
		Set<studentd> set=new HashSet<studentd>();
		//set madhe add method(put method kade janar)
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("s1======"+s1.hashCode());//hashcode  madhe memory location
		System.out.println("s2======"+s2.hashCode());
		System.out.println("s3======"+s3.hashCode());
		System.out.println("s4======"+s4.hashCode());
		System.out.println("set==="+set);
		
	}
}
	class studentd {
		int id;
		String name;
		
		//constructor
		public studentd(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
			
		}

          //to string 
		@Override
		public String toString() {
			return "studentd [id=" + id + ", name=" + name + "]";
		}
		
		
	}
	
	
	/*notes====yamdhe donghi object class kade ahe.yamdhe memory location fail hote karan hashcode object kade asel tr memory location
	           different yeil ani memory location different asel tr bucket location nehami different asel.
	            print hotana all records
	           print hotil
	 */

