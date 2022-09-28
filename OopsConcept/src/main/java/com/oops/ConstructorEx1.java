package com.oops;

public class ConstructorEx1 {

	String name;
	int id;

	ConstructorEx1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		ConstructorEx1 c1 = new ConstructorEx1("Smit", 101);
		ConstructorEx1 c2 = new ConstructorEx1("John", 103);

		System.out.println(c1.name + " " + c1.id);
		System.out.println(c2.name + " " + c2.id);

	}

}
