package com.someshpgm;

import java.util.Scanner;

public class InputFromUser {
public static void main(String[] args) {
	add1();
}
    static void add1() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter age");
	
	int age=sc.nextInt();
	if (age>=18) {
	System.out.println("You are eligible for voting");
	}
	else {
	System.out.println("You are not eligible for voting");
	}
}
}