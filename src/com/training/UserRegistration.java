package com.training;

import java.util.regex.*;

public class UserRegistration {
	private Pattern pattern;
	private Matcher matcher;
	private String firstName;
	private String firstNamePattern="^[A-Z][a-z]{3,}";
	public UserRegistration() {
		pattern=Pattern.compile(firstNamePattern);
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
		matcher=pattern.matcher(fistname);
		return matcher.matches();
	}
	@Override
	public String toString() {
		return "FirstName = " + firstName;
	}

	public static void main(String[] args) {
		UserRegistration UR=new UserRegistration();
		UR.setFirstName("Yudha");
		System.out.println(UR);
	}

}
