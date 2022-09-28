package com.inheritance;
//Multilevel inheritance Example..
public class InheritanceEx2 {
	public static void main(String[] args) {
		B1 b = new B1();
		b.showMain();
		b.showA();
		b.showB();
		
		
	}
	void showMain() {
		System.out.println("Show main");
	}
}

class A extends InheritanceEx2{
	void showA() {
		System.out.println("Show A");
	}
}
class B1 extends A{
	void showB() {
		System.out.println("Show B");
	}
}

