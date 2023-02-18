package com.demo;

public class CastingDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
	byte b=10;
	int a=b;// implicit Casting
	
	int a1=10;
	byte b1=(byte) a1;// Explicit Casting
	
	A aa=new A(1, "AA");
	System.out.println("aa====="+aa.hashCode());
	
	//A aa2=new A(1, "AA");
	
    A aaa	=(A) aa.clone();
    
    System.out.println("aaa==="+aaa.getClass());
    
    System.exit(0);
	
	A aa2=aa;
	
	System.out.println("equals object===="+aa.equals(aa2));
	
	String s1=new String("Abc");
	
	String s2=new String("Abc11");
	System.out.println("string equals===="+s1.equals(s2));
}
}
class A implements Cloneable{
	
	int id;
	String sanme;
	public A(int id, String sanme) {
		super();
		this.id = id;
		this.sanme = sanme;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", sanme=" + sanme + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
