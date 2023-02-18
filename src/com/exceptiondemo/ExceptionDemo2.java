package com.exceptiondemo;

public class ExceptionDemo2 {
  
	  public static void main(String[] args) throws CloneNotSupportedException {
		//ExceptionDemo2.exceptionDemo3();
		String s1=null;
		try {
		s1.length();
		}catch (Exception e) {
			e.printStackTrace();
		}
	// exceptionDemo1();
		
	}
	  
	  static void exceptionDemo1() throws CloneNotSupportedException,NullPointerException,ArithmeticException  {
		  Emp e1=new Emp(1, "AA");
		 
		Emp e2;
		
			e2 = (Emp) e1.clone();
			System.out.println("E2===="+e2);
		
			
			
	
		
			// TODO Auto-generated catch block
			
		
	  }
	  static void exceptionDemo2() throws CloneNotSupportedException {
		  exceptionDemo1();
	  }
	  
	  static void exceptionDemo3() throws CloneNotSupportedException {
		  exceptionDemo2();
	  }
	
	
}

class Emp implements Cloneable {
	int empId;
	 String empName;
	/**
	 * @param empId
	 * @param empName
	 */
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class AA implements Cloneable {
	int rollNo;
	String sname;
	/**
	 * @param rollNo
	 * @param sname
	 */
	public AA(int rollNo, String sname) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "AA [rollNo=" + rollNo + ", sname=" + sname + "]";
	}
	
}

class ReturnDemo{
	
	  static int  m1() {
		  
		  try {
			 // int a=10/0;
			  return 10;
		  }catch (Exception e) {
			return 20;
		}finally {
			 return 40;
		}
		// return 30;
	  }
	
}


