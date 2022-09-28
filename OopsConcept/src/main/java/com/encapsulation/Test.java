package com.encapsulation;

 class Ecap {
	
	private String name;
	private int age;
	private int id;
	
	
	public void setName(String name) {
	this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;		
		}
	
	public int getAge() {
			return age;
		}
	
	public void setId(int id) {
			this.id=id;	}
	
			public int getId() {
				return id;
			}

}
 public class Test extends Ecap{
	
	public static void main(String[] args) {
	
	Ecap e = new Ecap();
	
	e.setName("Darshan");
	e.setAge(25);
	e.setId(1);
	System.out.println(e.getName());
	System.out.println(e.getAge());
	System.out.println(e.getId());
	}
}