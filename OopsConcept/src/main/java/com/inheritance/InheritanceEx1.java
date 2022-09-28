package com.inheritance;


//Single inheritance example..
public class InheritanceEx1 {

	void show() {
		System.out.println("Single Inheritance.");
	}
	
}
class B extends InheritanceEx1{
	void showB() {
		System.out.println("Single B");
	}
	public static void main(String[] args) {
		B b = new B();
		InheritanceEx1 in1 = new InheritanceEx1();
		in1.show();
		b.showB();
		b.show();
		
	}
}