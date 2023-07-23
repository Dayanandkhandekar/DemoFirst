package com.ashutoshpgm;

public class MethodOverloading {
	public static void main(String[] args) {
		AA a1=new AA();
		 byte b=20;
		a1.add(b, b);
		
		int a=20;
		float f=a; //Implicit casting
		
		float ff=10.0f;
		int aa=(int)ff; // Explicit casting
		
	}

}

class AA{
	void add(int a,int b){
		System.out.println("squence 1");
		
	}
	float add(int a,int b,int c) {
		System.out.println("differeent number of parameter");
		return 0;
	}
	double add(float b, int a) {
		System.out.println("seq");
		return 0;
	}
	float add(int a, float b) {
		System.out.println("different sequence");
		return 0;
	}
}