package com.poojapgm;

public class Inheritancepratical {

}
class Emp //Parent class
{
	int empid;
	String empname;
	String gender;
	double salary;   
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", gender=" + gender + ", salary=" + salary + "]";
	}
	public Emp(int empid, String empname, String gender, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.gender = gender;
		this.salary = salary;
	}
	
}
class PEmp extends Emp // child class
{
	String payRollcompany;

	public PEmp(int empid, String empname, String gender, double salary, String payRollcompany) {
		super(empid, empname, gender, salary);
		this.payRollcompany = payRollcompany;
	}
	
}
class CEmp extends Emp
{
	int durationcontract;

	public CEmp(int empid, String empname, String gender, double salary, int durationcontract) {
		super(empid, empname, gender, salary);
		this.durationcontract = durationcontract;
	}
	
	
}
