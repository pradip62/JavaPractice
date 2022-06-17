package com.inspire.encapsulation;

public class EncapsulationUsingConstructor {
	int empId;

	EncapsulationUsingConstructor(int empId) {

		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public static void main(String[] args) {

		EncapsulationUsingConstructor e=new EncapsulationUsingConstructor(1);
	System.out.println(e.getEmpId());
	}

}
