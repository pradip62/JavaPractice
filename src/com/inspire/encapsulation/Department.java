package com.inspire.encapsulation;

public class Department extends Employee {

	static Employee employee;


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/*
	 * @Override public String toString() { return "Department [empId=" + empId +
	 * ", empName=" + empName + ", getEmployee()=" + getEmployee() + ", getempId()="
	 * + getempId() + ", getEmpName()=" + getEmpName() + ", getClass()=" +
	 * getClass() + ", hashCode()=" + hashCode() + ", toString()=" +
	 * super.toString() + "]"; }
	 */

	public static void main(String[] args) {
     employee =new Employee();	
     employee.setempId(1);
     employee.setEmpName("mahesh");
     System.out.println(employee.getempId());
		Department d=new Department();
		d.setEmployee(employee);
		System.out.println(d.getEmployee());
	}
}
