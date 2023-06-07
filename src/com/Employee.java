package com;

public class Employee {
	int empId;
	String empName;
	String phoneNum = "+17162564531";
	String empMail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println(e.calculateSalary(28888));
		e.empName = "Ruthvika";
		System.out.println(e.displayempName());
		e.displayempphnnum ();
	     e.setEmpEmail("ruthvika1415@gmail.com");
	   System.out.println(e.displayEmail());
	     
	     }
	double calculateSalary(double salary) {
		
		return salary*2;
	}
	
	     
	String displayempName()
	{
		return empName;
	}
	
	 void displayempphnnum ()
	{
		System.out.println(phoneNum);
	}
	
	 void setEmpEmail(String emailid)
	 {
		 empMail = emailid;
		 
		 
	 }
	 
	 String displayEmail()
	 {
		 return empMail;
		 
	 }
	
	
	
	
	
    

	
}
