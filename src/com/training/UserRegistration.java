package com.training;

import java.util.regex.*;

public class UserRegistration {
	private String firstName;
	private String firstNamePattern="^[A-Z][a-z]{2,}";
	private String lastName;
	private String lastNamePattern="^[A-Z][a-z]{2,}";
	public UserRegistration() {
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(this.validateLastName(lastName))
			this.lastName = lastName;
			else
				System.out.println("Last Name is Invalid !");
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(this.validateFirstName(firstName))
		this.firstName = firstName;
		else
			System.out.println("First Name is Invalid !");
	}
	public boolean validateFirstName(String fistname) {
		Pattern pattern1=Pattern.compile(firstNamePattern);
		Matcher matcher=pattern1.matcher(fistname);
		return matcher.matches();
	}
	public boolean validateLastName(String lastname) {
		Pattern pattern2=Pattern.compile(lastNamePattern);
		Matcher matcher=pattern2.matcher(lastname);
		return matcher.matches();
	}
	@Override
	public String toString() {
		return "FirstName = " + firstName+" LastName = "+lastName;
	}

	public static void main(String[] args) {
		UserRegistration UR=new UserRegistration();
		UR.setFirstName("Pooooo");
		UR.setLastName("Kol");
		System.out.println(UR);
	}

}
