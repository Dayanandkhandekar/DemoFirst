package com.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashTableDemo {

	static void hashMap() {
		Address ad1=new Address(11,"Pune");
		Address ad2=new Address(12,"Pune1");
		   
		// ad1.clone();
		String s1=null;
		      s1.length();
		
		HashMap<Address,Integer> hmap=new HashMap<Address, Integer>();
		   hmap.put(ad1, 10);
		   hmap.put(ad2, 20);
		   hmap.put(null, 30);
		   System.out.println("Useing HashMap========="+hmap);
		   
		   Hashtable<Address,Integer> htable=new Hashtable<Address, Integer>();
		   htable.put(ad1, 10);
		 //  htable.put(ad2, null);// not allowed
		  // htable.put(null, 30);// not allowed
		   System.out.println("Useing htable========="+htable);
		
		   System.out.println("Get==="+hmap.get(ad1));
		    
		
	}
	
	public static void main(String[] args) {
		hashMap();
		//soredeSetDemo();
	}
	
	static void soredeSetDemo(){
		
		SortedSet<Integer> sset=new TreeSet<Integer>();
		   sset.add(10);
		   sset.add(20);
		   sset.add(5);
		   sset.add(40);
		   
		   System.out.println("first======="+sset.first());
		   System.out.println("last==="+sset.last());
		   System.out.println("headset===="+sset.headSet(10));//  < obj
		   System.out.println("tailset===="+sset.tailSet(10));//  >=obj
		   System.out.println("subset===="+sset.subSet(5,20));   //   >=frObj  < toObj
	}
	
	
}

class Address {
	int pincode;
	String city;
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]\n";
	}
	/**
	 * @param pincode
	 * @param city
	 */
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}