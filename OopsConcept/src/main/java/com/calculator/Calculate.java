package com.calculator;

import java.util.Scanner;

//Calculator using methods and switch case.

public class Calculate {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Calculate c1 = new Calculate();
		System.out.println("Enter any two number: ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter 1 for Addition." + "\n" + "Enter 2 for Substraction." + "\n"
				+ "Enter 3 for Multiplication." + "\n" + "Enter 4 for Division.");

		int c = sc.nextInt();

		switch (c) {
		case 1:
			System.out.println(c1.sum(a, b));
			break;
		case 2:
			System.out.println(c1.sub(a, b));
			break;
		case 3:
			System.out.println(c1.mult(a, b));
			break;
		case 4:
			System.out.println(c1.div(a, b));
			break;

		}

	}

}
