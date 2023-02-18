package com.setdemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetDemo {
  static  public  void main(String[] args) {
	      
	    Set s=new HashSet();
	    s.add(10);
	    s.add(10.0);
	    s.add(10.0f);
	    s.add("asvc");
	    s.add('c');
	    s.add(null);
	     System.out.println("s=========="+s);
	     
	     Set ts=new TreeSet();
	     ts.add(null);
	   
	     
		     System.out.println("ts==========="+ts);
	    
	    System.exit(0);
	    List<Integer> list=new ArrayList<Integer>();
	    list.add(10);//0
	    list.add(20);//1
	    list.add(45);//2
	    list.add(30);//3
	    list.add(40);//4
	    System.out.println("list===="+list);
	    
	    List<Integer> list1=new LinkedList<Integer>(list);
	    list1.add(10);//0
	    list1.add(20);//1
	    list1.add(45);//2
	    list1.add(30);//3
	    list1.add(40);//4
	    System.out.println("list===="+list);
	    
	    Set<Integer> set1=new HashSet<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(40);
	    set1.add(40);
	    set1.add(40);
	    
	    System.out.println("set1==="+set1);
	    
	    Set<Integer> set2=new LinkedHashSet<Integer>();
	    set2.add(10);
	    set2.add(20);
	    set2.add(30);
	    set2.add(40);
	    set2.add(40);
	    set2.add(40);
	    
	    System.out.println("set2==="+set2);
	 
	         
 }
  
 
}

class Student {
	
	int studentId;
	String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]\n";
	}
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student() {
		super();
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	
	static void m1() {
		
		
		  Set<Student> setStudent=new HashSet<Student>();
          Student s1= new Student(1, "aa");
         Student s2= new Student(1, "aaa");
         Student s3=new Student(1, "aa");
         Student s4=new Student(2, "aa");
     //   Student s5=new Student(4, "aa");
         Student s5=new Student ();
         s5.setStudentId(4);
         s5.setStudentName("aa");
         
          System.out.println("hashCode s1==="+ s1.hashCode());
          System.out.println("hashCode  s2==="+ s2.hashCode());
          System.out.println("hashCode s3==="+ s3.hashCode());
          System.out.println("hashCode s4==="+ s4.hashCode());
          System.out.println("hashCode s5==="+ s5.hashCode());
       setStudent.add(s1);
       setStudent.add(s2);
       setStudent.add(s3);
       setStudent.add(s4);
       setStudent.add(s5);
       
       
     //  System.out.println("student set====="+setStudent);
       
       
       Set set=new HashSet<>();
       for(int i=0; i < 5;i++){
          Student ss=new Student();
          int rm=1+i;
          String sanme="aa"+i;
           ss.setStudentId(rm);
            ss.setStudentName(sanme);
            set.add(ss);
        }
       
       //System.out.println("set========"+set);
       
       
       
       List<Integer>  list =new ArrayList<Integer>();
       List<Integer>  lists =new ArrayList<Integer>();
       List<Integer>  listl =new ArrayList<Integer>();
	   list.add(10);
	   list.add(20);
	   list.add(50);
	   list.add(8);
	   list.add(9);
	   
	   int num=8;
		
		if (list.contains(num)) {
			for (int i = 0; i < list.size(); i++) {
				int number = list.get(i);

				if (list.contains(num)) {
					if (number <= num) {
						lists.add(number);
					} else {
						listl.add(number);
					}

				}
			}
		}else   
		  {
			  System.out.println("Invalid number");
			  }
		  
				for (int number : list) {
					if (list.contains(num)) {
						if (number <= num) {
							lists.add(number);
						} else {
							listl.add(number);
						}

					}
				}
		 
	     
	   lists=  list.stream().filter(x ->  x <=num).collect(Collectors.toList());
	   listl=  list.stream().filter(x ->  x >num).collect(Collectors.toList());
	   
	   System.out.println("lists====="+lists);
	   System.out.println("listl====="+listl);
	    
	    
       
	}

}

class A {
	
	void m1() {
		System.out.println("inside m1 A");
		 A a1=new A();
		
	}
	
	static void m2() {
		System.out.println("inside m2 A");
	}
	
	A(){
		
	}
}

class B extends A {
	void m1() {
		System.out.println("inside m1 B");
	}
	
	static void m2() {
		System.out.println("inside m2 B");
	}
}

// data overriding vs data hiding




