package com.pratiksha;

public class Demo {
public static void main(String[] args) {
	
	newstudent n1=new newstudent(1,"AA","BB",1);
	System.out.println("n1======="+n1);
}
}
class student{
	int stuid;
	String name;
	String address;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public student(int stuid, String name, String address) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [stuid=" + stuid + ", name=" + name + ", address=" + address + "]";
	}
}
class newstudent extends student{
	int standard;

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "newstudent [standard=" + standard + ", stuid=" + stuid + ", name=" + name + ", address=" + address
				+ "]";
	}

	public newstudent(int stuid, String name, String address, int standard) {
		super(stuid, name, address);
		this.standard = standard;
	}
}
