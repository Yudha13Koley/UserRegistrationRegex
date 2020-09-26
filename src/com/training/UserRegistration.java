package com.training;

import java.util.regex.*;

public class UserRegistration {
	private String firstName;
	private String firstNamePattern="^[A-Z][a-z]{2,}";
	private String lastName;
	private String lastNamePattern="^[A-Z][a-z]{2,}";
	private String email;
	private String emailPattern="(^[a-zA-Z0-9]+)"+"([. + _ -]?[a-zA-Z0-9]*)"+"[^. + _ -]@[a-zA-Z0-9]+"+"(\\.[a-zA-Z]{2,4})"+"(\\.[a-zA-Z]{2})?";
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(this.validateEmail(email))
			this.email = email;
			else
				System.out.println("Email is Invalid !");
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
	public boolean validateEmail(String email) {
		Pattern pattern1=Pattern.compile(emailPattern);
		Matcher matcher=pattern1.matcher(email);
		return matcher.matches();
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
		return "FirstName = " + firstName+" LastName = "+lastName+" Email = "+email;
	}

	public static void main(String[] args) {
		UserRegistration UR=new UserRegistration();
		UR.setFirstName("Pooooo");
		UR.setLastName("Kol");
		UR.setEmail("abc.xyz@bl.co.in");
		System.out.println(UR);
	}

}
