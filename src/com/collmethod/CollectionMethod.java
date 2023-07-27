package com.collmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionMethod {


	static void productInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product size");
		int Psize=sc.nextInt();
		List<product>listProduct=new ArrayList<product>();
		int count=0;
		do {
			System.out.println("enetr product id");
			int pid=sc.nextInt();
			
			System.out.println("enetr product name");
			String  pname=sc.next();
			
			
			System.out.println("enetr product price");
			double  pprice=sc.nextDouble();
			
			
			product pobj=new product(pid, pname, pprice);
			listProduct.add(pobj);
			
			count++;
			
		}while(count < Psize);
		System.out.println("===size full now===");
		
		
		System.out.println("===display product====");
		
		System.out.println(listProduct);
		List<product>pblistProduct=new ArrayList<product>();
		System.out.println("how many product you want");
		int pbsize=sc.nextInt();
		int userCount=0;
		do {
			System.out.println("enter pid");
			int userpid=sc.nextInt();
			for(product pobj :listProduct) {
			int pid=	pobj.getpId();
			if(userpid==pid) {
				pblistProduct.add(pobj);
			}
			}
			userCount++;
		}while(userCount <pbsize );
		
		System.out.println("===user product list===");
		System.out.println(pblistProduct);
		double totalBill=0;
		for(product pobj:pblistProduct) {
			totalBill=totalBill+pobj.getpPrice();
		}
		System.out.println("your total bill=="+totalBill);
		
		System.out.println("===EOP===");
		
		
	}
	public static void main(String[] args) {
		productInfo();
	}
}


class product{
	int pId;
	String pName;
	double pPrice;
	public product(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	}

