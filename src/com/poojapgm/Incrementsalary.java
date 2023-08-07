package com.poojapgm;

import java.util.ArrayList;
import java.util.List;

public class Incrementsalary {

	
	public static void main(String[] args) {
		incrementsalary();
	}
	
	static void incrementsalary()
	{
		Emp1 e1=new Emp1(1, "Suraj","IT",4000);
		Emp1 e2=new Emp1(2, "Akshay","Marketing",5000);
		Emp1 e3=new Emp1(3, "Vishal","Finance",6000);
		Emp1 e4=new Emp1(4, "Vaibhav","Accounting",8000);
		Emp1 e5=new Emp1(5, "Laxman","IT",7000);
		
		List<Emp1>emplist=new ArrayList<Emp1>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		List<Emp1>emplist1=new ArrayList<Emp1>();
		for(Emp1 obj:emplist) {
			if(obj.getDept().equalsIgnoreCase("IT")) {
				obj.setSalary(obj.getSalary()+5000);
				emplist1.add(obj);
			}
			else {
				emplist1.add(obj);
			}
		}
		System.out.println("After increment salary==========="+ emplist1);
	}
}

class Emp1
{
	int empid;
	String empname;
	String dept;
	double salary;
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp1 [empid=" + empid + ", empname=" + empname + ", dept=" + dept + ", salary=" + salary + "]\n";
	}
	/**
	 * @param empid
	 * @param empname
	 * @param dept
	 * @param salary
	 */
	public Emp1(int empid, String empname, String dept, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
}
