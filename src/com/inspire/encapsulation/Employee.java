package com.inspire.encapsulation;

public class Employee {

	int empId = 2;
	String empName;

	public void setempId(int empId) {
		this.empId = empId;

	}

	public int getempId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + "]";
//	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setempId(1);
		e.setEmpName("ram");
		System.out.println(e.getempId() + " " + e.empName);
	}

}
