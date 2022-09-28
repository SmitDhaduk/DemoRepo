package com.inheritance;

//Inherirance Multilevel example..
public class Inheritanceex3 {
	
	public static void main() {
		A3 a = new A3();
		a.showMain();
		a.showA3();
		
		B3 b = new B3();
		b.showMain();
		b.showB3();
	}

	void showMain() {
		System.out.println("It is a Main method...");
	}
}
class A3 extends Inheritanceex3{
	
	void showA3() {
		System.out.println("It is a A3 method...");
	}
}
class B3 extends Inheritanceex3{
	void showB3() {
		System.out.println("It is a B3 method...");
	}
	
}