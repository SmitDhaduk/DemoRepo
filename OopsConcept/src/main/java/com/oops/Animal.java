package com.oops;

public class Animal {
	
	public void eat() {
		System.out.println("I am eating");
	}
	
	public void run() {
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		
		System.out.println("1");
		
		Animal buzzo = new Animal();
		Bird crow = new Bird();
		
		buzzo.eat();
		buzzo.run();
		crow.fly();
	}

}
class Bird{
	
	void fly() {
		System.out.println("I am flying.");
	}
}