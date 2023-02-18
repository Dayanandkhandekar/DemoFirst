package com.accessmodi1;

public class AccessModi1 {
   public static void main(String[] args) {
	  A.m2(20);
	  A.m4("abc");
	  A.m3(new A());
	  A.m3(new B());
	  
}
}

class A {
	
	  public  int a;// instance variable
      static int b;// static variable

     {
        int c;// local variable
     }

 static  {

    }
     
     void m1(int aa){
          int d;//local variable
 
     }

static void m2(int bb){
	
    }

   // syatnx methods

 //   return type     method name() {


  //}


static String m4(String str) {
	
	return ""; 
}

   static  A m3(A aa) {
	
    return	new A();
}
	
}

class B extends A {
	
}
