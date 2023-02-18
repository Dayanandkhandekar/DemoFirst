package com.demo;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
  public static void main(String[] args) {
	  
     
     StudentSS s1=new StudentSS(1, "AA");
     StudentSS s2=new StudentSS(2, "BA");
     StudentSS s3=new StudentSS(3, "CA");
     StudentSS s4=new StudentSS(1, "DA");
     
		/*
		 * TreeSet<StudentSS> ts=new TreeSet<StudentSS>(); ts.add(s1); ts.add(s2);
		 * ts.add(s3); ts.add(s4); System.out.println("ts======"+ts);
		 */
     
     TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
           tm.put(10, "AA");
           tm.put(20, "AAA");
           tm.put(10, "CA");
            System.out.println("tm======="+tm);
            
            TreeMap<StudentSS, String> tm1=new TreeMap<StudentSS, String>();
            
            tm1.put(s1, "AAA");
            tm1.put(s2, "AAA1");
            tm1.put(s3, "AAA2");
            tm1.put(s4, "AAA3");
            System.out.println("tm1========"+tm1);
            
            Comparator<StudentSS> c=new Comparator<StudentSS>() {

				@Override
				public int compare(StudentSS o1, StudentSS o2) {
					// TODO Auto-generated method stub
					return o1.getSid()-o2.getSid() ;
				}
			};
            
            TreeMap tt=new TreeMap(c);
              tt.put(10, "AA");
              tt.put(s1, "BB");
              System.out.println("tt==========="+tt);
     
     
}
}

class StudentSS implements Comparable<StudentSS> {
	int sid;
	String sname;
	public StudentSS(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]\n";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public int compareTo(StudentSS o) {
		// TODO Auto-generated method stub
		return this.getSid()-o.getSid();
	}
	
	
	
	
}
