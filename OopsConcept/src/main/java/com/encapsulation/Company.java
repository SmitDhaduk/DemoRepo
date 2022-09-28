package com.encapsulation;

public class Company {
	
	
	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(101);
		System.out.println(e.getEmpId());
	}

}

class Employee {
	private int empId;

	public void setEmpId(int eId) {
		this.empId = eId;
	}

	public int getEmpId() {
		return empId;
	}
}
