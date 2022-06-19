package com.itsupportadmin.model;

public class employee {
	
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public employee(String firstName,String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//void display() {System.out.println(firstName+"."+lastName);}
	
}
