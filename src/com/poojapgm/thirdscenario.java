package com.poojapgm;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class thirdscenario {
	
	public static void main(String[] args) {
		//object created
		students1 s1=new students1(1,"abcd");
		students1 s2=new students1(1,"abcd");
		students1 s3=new students1(2,"efgh");
		students1 s4=new students1(1,"abc");
		
		Set<students1> set=new HashSet<students1>();
	//set add method madhe 
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("s1======"+s1.hashCode());///  hashcode for memory location 
		System.out.println("s2======"+s2.hashCode());
		System.out.println("s3======"+s3.hashCode());
		System.out.println("s4======"+s4.hashCode());
		System.out.println("set==="+set);
		
	}
}
	class students1 {
		int id;
		String name;
		
		//constructor
		public students1(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
			
		}

         //to string
		@Override
		public String toString() {
			return "students1 [id=" + id + ", name=" + name + "]";
		}

        //hashcode id field varun select kele
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		/*Notes----------------------------ya case madhe hashcode user kade ahe and equal object kde ahe .user define class madhe hashcode
		 *                                 override kela jato.(id varun) pn equal object kade ahe reference equality madhe fail hoel
		 *                                run hotana-  memory location bhetete ani bucket location dile jate
		 */

		
		
	}

