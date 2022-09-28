package com.oops;

public class AnimalEx1 {
	
	String color;
	int age;
	
	public void initObj(String c, int a) {
		color = c;
		age = a;
	}

	public void display() {
		System.out.println("Color: "+color+", "+ "Age: "+age);
	}
	
	public static  void main(String[] args) {
		AnimalEx1 buzzo = new AnimalEx1();
		buzzo.initObj("Black",10);
		buzzo.display();
	}
}

