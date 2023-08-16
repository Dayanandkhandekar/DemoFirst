package com.poojapgm;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Fourthscenario {
	
	public static void main(String[] args) {
		//object created
		student11 s1=new student11(1,"abcd");
		student11 s2=new student11(1,"abcd");
		student11 s3=new student11(2,"efgh");
		student11 s4=new student11(1,"abc");
		
		Set<student11> set=new HashSet<student11>(); //student11 object
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
	class student11 {
		int id;
		String name;
		
		//constructor
		public student11(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
			
		}

        //to string
		@Override
		public String toString() {
			return "student11 [id=" + id + ", name=" + name + "]";
		}

          /// hashcode id field selected
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

         //equal name select(different field name)
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			student11 other = (student11) obj;
			return name == other.name && Objects.equals(name, other.name);
		}

}


    /*Notes-------ya case madhe hashcode and equal he user kade ahe different field name use karun.
	              memory loation bhete and bucket bhetete.jynchi memory location same ahe tyna ek bucket dile jate ani je
	              content madhe compare hot nahi tyna other bucket dile jate.
	              e.g eka bucket madhe je content ahet te compare karatat same asel tr eka bucket madhe nhi tr other bucket madhe add
	              id same ahe content madhe difference ahe te pn add 
	*/