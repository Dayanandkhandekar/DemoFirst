package com.poojapgm;

public class Employee {
	 int id; 
	 String name;
	 int mark;
	 
	 public static void main(String[] args) {
		 Employee e1= new Employee();
		 e1.setId(1);
		  e1.setName("abc");
		  e1.setMark(50);
		System.out.println("e1==="+e1);
		Employee e2=new Employee(10,20);
		System.out.println("e2==="+e2);
		Employee e3=new Employee(3,"vv",30);// int string int
		System.out.println("e3==="+e3);
		
	}
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	 
	 protected Employee(){
		   System.out.println("inside no arg constrcutor");
	   }
	   
	    Employee(int a,int b,int c){
	    	System.out.println("inside three para");
	    	
	    }

	      Employee(int a,int b){
	    	  System.out.println("inside two para");
	      }
 
 
 
 
 
 /**
	 * @param id
	 * @param sname
	 * @param mark
	 */
public Employee(int id, String name, int mark) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
}
 
}
