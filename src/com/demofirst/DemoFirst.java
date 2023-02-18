package com.demofirst;

import java.util.Arrays;

public class DemoFirst {
     public static void main(String[] args) throws CloneNotSupportedException {
    	
    	 Student dd1=new Student();
    	 
    	 System.exit(0);
    	 
    	 Student s1=new Student();
    	 s1.setStudentId(1);
    	 s1.setStudentName("Abc");
    	 s1.setStudentMark(60);
    	System.out.println("s1===="+s1);
    	System.out.println("getclass ===="+s1.getClass());
    	 Student s2=   (Student)s1.clone();
    	 System.out.println("s2===="+s2);
    	
    	 Student s3=new Student(2,"XYZ",70);
    	 
    	 
    	
    	 Demo d=new Demo();
    	d.setA(10);
    	StringBuffer sb = new StringBuffer("abc");
    	d.setAbc(sb);
    	DemoFirst df =new DemoFirst();
    	  d.setAs(df);
    	  d.setSname("abc1");
    	  Demo dd=new Demo();
       d.setFf(dd);
       
       
       System.out.println("ddd========="+d);
    	 
       System.out.println("ddd========="+d.getSname());
    	 
    	 // variables --- 3 types
    	  //1.Local variable--- within block or methods
    	 //2. Instance Variable--- class level declaration without static keyword
    	 //3.Static variable--class level declaration with static keyword
    	 
    	 // blocks in java -- 2
    	 // Instance block
    	 // static block
    	 
    	 // methods -- 2
    	 // 1.Instance methods
    	 // 2.Static method
    	 
    	 
    	 // how to create object in java --- 5ways
    	 // 1. new keyword
    	 // 2. clone method
    	 
    	 // object---  It is the real world entity
    	 
    	    // Its having its own state, identity, behaviour
    	 
    	 // pen  
    	 // state-- color,size,price
    	 // identity--- company name
    	 // fun--  wrriting   
    	 
    	  // local variables are by default final
    	 
	}
}

class Demo {
	 // variables -- name given to memory location
	  int a=10; // instance variables
	
	  static int b;// static variables
	  static int d;// static variables
	  String sname;
	  StringBuffer abc;
	  DemoFirst as;
	  Demo ff;
	{// instance block
		int d;// local variable
		System.out.println("Inside instance block"+a +" "+b);
	}
	
	static {
		Demo d=new Demo();
		System.out.println("Static block" +" "+b  +" "+d.a);
	}
	// methods syntax--    return type   methodName() {}
	
	  void m1() {
		  int d=20;// local variable
		  System.out.println("Inside instance method"+a +" "+b +" "+d );
	  }
	  
	 static  void m2() {
		 Demo d=new Demo();
		  System.out.println("Inside static method"+d.a+" "+b);
	  }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Demo.b = b;
	}

	public static int getD() {
		return d;
	}

	public static void setD(int d) {
		Demo.d = d;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public StringBuffer getAbc() {
		return abc;
	}

	public void setAbc(StringBuffer abc) {
		this.abc = abc;
	}

	public DemoFirst getAs() {
		return as;
	}

	public void setAs(DemoFirst as) {
		this.as = as;
	}

	public Demo getFf() {
		return ff;
	}

	public void setFf(Demo ff) {
		this.ff = ff;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", sname=" + sname + ", abc=" + abc + ", as=" + as + ", ff=" + ff + "]";
	}
	 
	
	
}


class Demo1{
	 
	{
		Demo d=new Demo();
		System.out.println("Inside instance block demo1"+d.a +" "+Demo.b +" "+d.b);
	}
	
	static{
		Demo d=new Demo();
		System.out.println("Inside static block demo1"+d.a +" "+Demo.b +" "+d.b);
	}
	
	  void m3() {
		  Demo d=new Demo();
		  int dd;// local variable
		  System.out.println("Inside instance method demo1" +d.a +" "+Demo.b +" "+d.b);
	  }
	  
	 static  void m4() {
		 Demo d=new Demo();
		 
		  System.out.println("Inside static method demo1"+d.a +" "+Demo.b +" "+d.b);
	  }
}

class Abc {
	
	  void arrayImpl() {
		  
		  //syntax array   ---  data type array_name[] =new datatype[size]; 
		  
		  int a[]=new int[4];
		    a[0]=10;
		    a[1]=15;
		    a[2]=20;
		    a[3]=30;
		  //  a[4]=10;
		    
		      a=Arrays.copyOf(a, 8);
		  
	  }
}


class Student implements Cloneable{
	int studentId;
    String studentName;
    int studentMark;
	
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
	public int getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMark=" + studentMark
				+ "]";
	}
	
   @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
   

  public Student(int dd, String studentName, int studentMark) { 
	  super();
	  this.studentId = dd; 
	  this.studentName = studentName; 
	  this.studentMark  = studentMark; 
  }
 
   Student(){
	   this(10);
	   System.out.println("Inside no arg");
	  
   }
   
 Student(int a){
	 this(10,20);
	 System.out.println("Inside int arg");
   }
 
 Student(int a,int b){
	 System.out.println("Inside two arg");
 }
  
    
}