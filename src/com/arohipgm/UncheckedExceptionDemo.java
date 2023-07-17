package com.arohipgm;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		arithmaticExceptionDemo();
		NullPointerException();
		ArrayIndexOutofbond();
		NumberFormateException();
	}
	
	static void arithmaticExceptionDemo() {
       System.out.println("====A======");
       System.out.println("======B======");
		
		try {
            int result = 10/0; // Division by zero
            System.out.println("Result: " + result);
        }
         catch (Exception e) {
			int result=10/2;
			System.out.println("Arithmatic Exception();="+result);
		}
		
	}
	
	static void NullPointerException() {
		try {
		String str=null;
		str.length();
	}catch (NullPointerException e) {
           System.out.println("Null Pointer Exception");
	}
	       System.out.println("====C======");
	       System.out.println("====D======");
	}
	
	static void ArrayIndexOutofbond() {
		try {
		int num[]= {10,20,30,40};
		 int array=num[4];
		 System.out.println("value=="+array);
		}catch (Exception e) {
			System.out.println("Array Index Out of bond");
		}
		 System.out.println("=====E======");
		 System.out.println("=====F======");
	}
	
	static void NumberFormateException() {
	
		 try {
		 String s1="abc";
		 int num= Integer.parseInt(s1);
		 System.out.println("num=="+num);
		 }catch (Exception e) {
			 System.out.println("Number Formate Exception");
		}
		 System.out.println("=====G======");
		 System.out.println("=====H======");
	
	}
   
}

/* he sarv Unchecked Exception ch example aahet 
 * try madhe risky code write kela ani catch block madhe alternative code write kela 
		 * karan program smoothly excute houde mhanun 
 * 
 * 
 */
