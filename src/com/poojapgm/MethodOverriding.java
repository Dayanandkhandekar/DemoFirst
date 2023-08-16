package com.poojapgm;

public class MethodOverriding{ 
	
    public static void main(String[]args) {
    	
    	/* main method madhe call kartana 
    	 calling method
    	 */
    	
    	AA a=new AA();// 1) Parent cha reference ani Parent ch object
    	a.add();  //parent object  parent  class method  call
    	
    	AA a1=new BB(); // 2)Parent cha reference ani child object
    	a1.add1();    // child object and call child class method 
    
    	
    	AA a2=new BB();  //parent ch reference ani child object 
    	a2.add2();    //child object and call child class method 
    	               /* (child class madhe ti method asel tr call nasel tr ti parent class madhe check 
    	                krel ti method call hoel */  
    	
    	BB b=new BB();  //4) child class reference ani child class object 
    	  b.add();       //child class method call
    	
    	BB b1=new BB();   // child class reference and child class object
    	b1.add2();     //  call  parent class method (child ha parent chi method access karu shkto)
    	                  
    }
    
}
	class AA
	{
		 void add()
		{
		System.out.println("add method ");
		}
		Double add1()
		{
	     System.out.println("add method1");
	     return 0.0;
		}
		String add2()
		{
	     System.out.println("add method 2");
		return null;
	     
		}
		protected int add3()
		{
			System.out.println("add method 3");
			return 0;
		}
	}
	
	class BB extends AA
	{
	       void add()
		{
		 System.out.println("inside add method  in child class");
		}
		Double add1()
		{
		System.out.println("inside add1 method in child class");
		return 0.0;
		}
	/*	 String add2() 
		{
		 System.out.println("inside add2 method in child class");
		return null;
	  	}*/
		protected int add3()
		{
			System.out.println("inside add 3 method in child class");
			return 0;
		}
	}

	/* Rules for method overriding
	  1) same method and same parameter used in parent child class
	  
	  2) return type:
	     I)parent class madhe return type ha primitive aasel manje int asel method override kelyantr
	     tycha child class madhe toch return type asel 
	     II) parent class madhe return type ha Wrapper asel manje Byte Short Integer asel method 
	     override kelyntr tycha child class madhe toch return type asel 
	  
	 3)  Object:
	      parent class madhe method cha return type ha user defined manje a add() kive system
	      defined manje String add2() asel tr tycha return type ha toch asto kiva
	      child asto manje method override kele ki child class cha object create manje B add().
	
	  4) Access Modifier: 
	       method cha access modifer ha default , protected , public asel tr method override kele
	       li child class madhe toch access modifier ha toch asto kiva tycha peksha mottha asto
	       (wider)
	       
	   private access modifer ha override karata yet nahi karan to private ahe 
	Parent class madhe  Protected access modifer asel tr to override kele ki child class madhe 
	public kiva protected lau shkto
	            
	     */
