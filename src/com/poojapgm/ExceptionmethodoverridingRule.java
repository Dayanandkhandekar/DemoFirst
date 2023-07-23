package com.poojapgm;

public class ExceptionmethodoverridingRule {
	
	public static void main(String[] args) {
		
	}
	
	class ABCParent{
		void s1() throws v{   //Rule 1:Parent chya method ne ekhade exception throw kele ahe tech exception child chya method ne throw
			                 // karyla pahije kiva tyche child kiva nahi kele tri chalte
			
		}
		void s2() {
			
		}
		void s3()  throws NullPointerException{// he exception unchecked tyamule error yet nahi ethe ani tyasathi kahi rule nahit.
			
		}
	}
	class PQRChild extends ABCParent
	{
		void s1() throws v {         //rule 1che result void s1() throws v kiva v1
			                       //Rule 2:Child chya method ne ekhade exception  throw kele ahe tech exception parent method ne throws
			                       //karyla pahije kiva tyche parent (compulsary karyla pahije)
			
			
		}
		void s2() { 
			
		}
		void s3() {
			
		}
	}
	class v extends Exception {
		public v(String s) {
		super(s);
	}
	}
	class v1 extends Exception {
		public v1(String s) {
			super(s);
		}
	}

}
