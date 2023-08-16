package com.ashutoshpgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentBill {
public static void main(String[] args) {
	 TotalBill();
}
static void TotalBill() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size");
	int Usize=sc.nextInt();
	List<BookInfo>listBook=new ArrayList<BookInfo>();
	int count=0;
	boolean flag=false;
	do {
		System.out.println("enter book id");
		int BookId=sc.nextInt();
		
		System.out.println("enter book name");
		String BookN=sc.next();
		
		System.out.println("enter authour name");
		String  AuthN=sc.next();
		
		System.out.println("enter book price");
		int  BookP=sc.nextInt();
		BookInfo book=new BookInfo(BookId, BookN, AuthN, BookP);
		if(listBook.size() < Usize ) {
			listBook.add(book);
			System.out.println("Do u want Continoue ");
			String msg=sc.next();
			if(msg.equalsIgnoreCase("Y")) {
				flag=true;
			}else {
				flag=false;
			}
			
			
		}else {
			System.out.println("size full");
			flag=false;
		}
		
	}while(flag);
	
	System.out.println("=======Book List========");
	System.out.println(listBook);
	
	boolean userflag=false;
	double totalPrice=0;
	   System.out.println("How May Book U want");
	   int bookUserSize=sc.nextInt();//2
	   
	   System.out.println("Enter ur Student Id");
	   int studentId=sc.nextInt();
	   
	   System.out.println("Enter ur Name");
	   String sname=sc.next();
	   
	   List<BookInfo> userBooklist=new ArrayList<>();
	    
	    do {
	    	  if(userBooklist.size() < bookUserSize) {
	    		  System.out.println("Enter book Id");
	    		  int usrBookId=sc.nextInt();
	    		  for(BookInfo bObj:listBook) {
	    			  if(bObj.getBookId() ==usrBookId ) {
	    				  userBooklist.add(bObj);
	    			  }
	    		  }
	    		  System.out.println("Do u want continoue");
	    		  String msg=sc.next();
	  			if(msg.equalsIgnoreCase("Y")) {
	  				userflag=true;
	  			}else {
	  				
	  				userflag=false;
	  			}
	    	  }else {
	    		  System.out.println("user size full");
	    		  userflag=false; 
	    	  }
	    	  
	    	
	    }while(userflag);
	
	     for(BookInfo userBook:userBooklist) {
	    	 totalPrice=totalPrice+userBook.getBookP();
	     }
	     student s1=new student(studentId, sname, totalPrice);
	     System.out.println("s1======"+s1);
	
}
	
}
class student{
	int stdId;
	String stdN;
	double price;
	@Override
	public String toString() {
		return "student [stdId=" + stdId + ", stdN=" + stdN + ", price=" + price + "]\n";
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdN() {
		return stdN;
	}
	public void setStdN(String stdN) {
		this.stdN = stdN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public student(int stdId, String stdN, double price) {
		super();
		this.stdId = stdId;
		this.stdN = stdN;
		this.price = price;
	}
	
	 
}
class BookInfo{
	 int BookId;
	 String BookN;
	 String AuthN;
	 double BookP;
	@Override
	public String toString() {
		return "BookInfo [BookId=" + BookId + ", BookN=" + BookN + ", AuthN=" + AuthN + ", BookP=" + BookP + "]\n";
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookN() {
		return BookN;
	}
	public void setBookN(String bookN) {
		BookN = bookN;
	}
	public String getAuthN() {
		return AuthN;
	}
	public void setAuthN(String authN) {
		AuthN = authN;
	}
	public double getBookP() {
		return BookP;
	}
	public void setBookP(double bookP) {
		BookP = bookP;
	}
	public BookInfo(int bookId, String bookN, String authN, double bookP) {
		super();
		BookId = bookId;
		BookN = bookN;
		AuthN = authN;
		BookP = bookP;
	}
	 
}