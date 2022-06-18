package com.employee;

public class Employee {

	public void empId() {
		System.out.println("Employee Id:123");
	}

	public void empName() {
		System.out.println("Employee Name : Vetri");
	}

	public void empAge() {
		System.out.println("Employee Age : 23");
	}

	public void empEmail() {
		System.out.println("Employee Email : Vetri@gmail.com");
	}

	public void empSalary() {
		System.out.println("Employee Salary : 500000");
	}

	public void empDepartment() {
		System.out.println("Employee Department :IT");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empAge();
		e.empDepartment();
		e.empEmail();
		e.empSalary();
	}
}
