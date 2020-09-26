package com.training;

import java.util.regex.*;

public class UserRegistration {
	private String firstName;
	private String firstNamePattern="^[A-Z][a-z]{2,}";
	private String lastName;
	private String lastNamePattern="^[A-Z][a-z]{2,}";
	private String email;
	private String emailPattern="(^[a-zA-Z0-9]+)"+"([. + _ -]?[a-zA-Z0-9]*)"+"[^. + _ -]@[a-zA-Z0-9]+"+"(\\.[a-zA-Z]{2,4})"+"(\\.[a-zA-Z]{2})?";
	private String mobileNo;
	private String mobileNoPattern="(^\\+)([0-9]{2,3})(\\s)"+"[0-9]{10}$";
	private String password;
	private String passwordPatternRule1="(?=.{8,})(?=.*[A-Z])(?=.*\\d).*$";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(this.validatePassword(password))
			this.password=password;
			else
				System.out.println("Password is Invalid !");
	}
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		if(this.validateMobileNo(mobileNo))
			this.mobileNo = mobileNo;
			else
				System.out.println("Mobile Number is Invalid !");
	}

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
	public boolean validateMobileNo(String Mob) {
		Pattern pattern1=Pattern.compile(mobileNoPattern);
		Matcher matcher=pattern1.matcher(Mob);
		return matcher.matches();
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
	public boolean validatePassword(String password) {
		Pattern pattern=Pattern.compile(passwordPatternRule1);
		Matcher matcher=pattern.matcher(password);
			return matcher.matches();
	}
	@Override
	public String toString() {
		return "FirstName = " + firstName+" LastName = "+lastName+" Email = "+email+" Mobile No = "+mobileNo+" Password = "+password;
	}

	public static void main(String[] args) {
		UserRegistration UR=new UserRegistration();
		UR.setFirstName("Pooooo");
		UR.setLastName("Kol");
		UR.setEmail("abc.xyz@bl.co.in");
		UR.setMobileNo("+91 9804809458");
		UR.setPassword("^@8Aghhh");
		System.out.println(UR);
	}

}
