
//second way of comparator
package com.arohipgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"AAA",2000);
		Employee e2=new Employee(2,"BBB",3000);
		Employee e3=new Employee(3,"CCC",5000);
		Employee e4=new Employee(4,"DDD",6000);
		Employee e5=new Employee(5,"EEE",8000);
		
		List<Employee>listEmployee=new ArrayList<Employee>();
		listEmployee.add(e1);
		listEmployee.add(e2);
		listEmployee.add(e3);
		listEmployee.add(e4);
		listEmployee.add(e5);
		
	System.out.println(" Before Sorting ===="+listEmployee);
		
		Collections.sort(listEmployee, new sortedbysalary());
		
		System.out.println("Sorting===="+listEmployee);
	}

}

class Employee{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
	
	
}

class sortedbysalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) -(o1.getSalary()-o2.getSalary());
	}
	
	public sortedbysalary() {
		
	}
	
}
