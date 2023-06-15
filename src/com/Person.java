package com;

public class Person {
	
	private String personName;
	private int personAge;
	
	public Person(String personName, int personAge)
	{
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	
	public int getPersonAge()
	{
		return personAge;
		
	}
	
	
	
	

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public static void main(String[] args) {
		 
		Person person = new Person("Nagraju",25);
				
				System.out.println("Name:" + person.getPersonName());
		        System.out.println("Age" + person.getPersonAge());
		        
				
	  

	}

}
