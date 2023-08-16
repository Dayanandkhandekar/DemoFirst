package com.poojapgm;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Fifthscanerio {
	
	public static void main(String[] args) {
		//object created
		student12 s1=new student12(1,"abcd");
		student12 s2=new student12(1,"abcd");
		student12 s3=new student12(2,"efgh");
		student12 s4=new student12(1,"abc");
		
		Set<student12> set=new HashSet<student12>();
		//add method
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
	class student12 {
		int id;
		String name;
		
		//constructor
		public student12(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
			
		}

        //to string
		@Override
		public String toString() {
			return "student12 [id=" + id + ", name=" + name + "]";
		}

          // hashcode id varun
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

        //equal pn id varun
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			student12 other = (student12) obj;
			return id == other.id;
		}
		}

	
	/*   Notes ------ ya case madhe hashcode user kade ani object user kadech ahe same field name use karun  tymule te proper hoeil.abstract        
	                   memory location bheetel .buckets miltil jychi bucket location same ahe tyna ek bucket bhetel.
	                  run hotana- id varun content display honar.
	                  */ 