package com.jayfirstdemo;

import java.util.Scanner;

public class AllStmtAssignment {

	public static void main(String[] args) {
		MultipleStmtDemo.assignmentDemo();

	}

}

class MultipleStmtDemo {

	static void assignmentDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		int fact = 1;
		boolean flag = false;
		do {
			System.out.println("Enter your choice:");
			System.out.println("!.Prime number   2.OddEven    3.Factorial     4.DivBy4");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (num == 1 || num == 2 || num == 3 || num == 5 || num == 7) {
					System.out.println("It's Prime Number");
				} else if (num % 2 > 0 && num % 3 > 0 && num % 5 > 0 && num % 7 > 0) {
					System.out.println("It's Prime Number");
				} else {
					System.out.println("It's Not Prime Number");
				}
				break;

			case 2:
				if (num % 2 == 0) {
					System.out.println("It's Even Number");

				} else {
					System.out.println("It's Odd Number");
				}
				break;

			case 3:
				for (int i = 1; i <= num; i++) {
					fact = fact * i;

				}
				System.out.println("Facorial is" + fact);
				break;

			case 4:
				if (num % 4 == 0) {
					System.out.println(num + "Number is divisible by 4");

				} else {
					System.out.println(num + "Number is not divisible by 4");
				}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue?");
			String msg = sc.next();
			if (msg.equalsIgnoreCase("y")) {
				flag = true;
			} else {
				flag = false;
				System.out.println("====EOP=====");
			}
		} while (flag);
	}
}