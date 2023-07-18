
 
package com.arohipgm;

public class CloneDemo {
	public static void main(String[] args) {
		Person e1=new Person(1,"aaa");
            try {
            	Person e2=(Person)e1.clone();
				System.out.println("e1===="+e1);
				System.out.println("e2===="+e2);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
	}

}
class Person implements Cloneable{  //ekadya object cha clone kartana ty class madhe jr 
	int id;                           //marker interface cloneable navacha implements nhi kela tr exception yete
	String nmae;  
	public Person(int id, String nmae) {
		super();
		this.id = id;
		this.nmae = nmae;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nmae=" + nmae + "]\n";
	}
	
	
	@Override            // To override the clone method
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}