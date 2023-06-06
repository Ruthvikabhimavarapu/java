package com;

public class Employee {
	int empId;
	String empName;
	String phoneNum;
	String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println(e.calculateSalary(28888));

	}
	double calculateSalary(double salary) {
		
		return salary*2;
	}

}
