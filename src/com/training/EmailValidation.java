package com.training;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private Pattern pattern;
	private Matcher matcher;
	private static final String EmailPattern="(^[a-zA-Z0-9]+)"+"([. + _ -]?[a-zA-Z0-9]*)"+"[^. + _ -]@[a-zA-Z0-9]+"+"(\\.[a-zA-Z]{2,4})"+"(\\.[a-zA-Z]{2})?";
	public EmailValidation() {
		pattern=Pattern.compile(EmailPattern);
	}
	public boolean Validate(String email) {
		matcher=pattern.matcher(email);
		return matcher.matches();
	}
	public static void main(String[] args) {
		EmailValidation d1=new EmailValidation();
		System.out.println("Valid Ids");
		System.out.println("The ID abc@yahoo.com is Valid :"+d1.Validate("abc@yahoo.com"));
		System.out.println("The ID abc-100@yahoo.com is Valid :"+d1.Validate("abc-100@yahoo.com"));
		System.out.println("The ID abc.100@yahoo.com is Valid :"+d1.Validate("abc.100@yahoo.com"));
		System.out.println("The ID abc111@abc.com is Valid :"+d1.Validate("abc111@abc.com"));
		System.out.println("The ID abc-100@abc.net is Valid :"+d1.Validate("abc-100@abc.net"));
		System.out.println("The ID abc.100@abc.com.au is Valid :"+d1.Validate("abc.100@abc.com.au"));
		System.out.println("The ID abc@1.com is Valid :"+d1.Validate("abc@1.com"));
		System.out.println("The ID abc@gmail.com.co is Valid :"+d1.Validate("abc@gmail.com.co"));
		System.out.println("The ID abc+100@gmail.com is Valid :"+d1.Validate("abc+100@gmail.com"));
		
		System.out.println("Invalid Ids are");
		System.out.println("The ID abc is Valid :"+d1.Validate("abc"));
		System.out.println("The ID abc@.com.my is Valid :"+d1.Validate("abc@.com.my"));
		System.out.println("The ID abc123@gmail.a is Valid :"+d1.Validate("abc123@gmail.a"));
		System.out.println("The ID abc123@.com is Valid :"+d1.Validate("abc123@.com"));
		System.out.println("The ID abc123@.com.com is Valid :"+d1.Validate("abc123@.com.com"));
		System.out.println("The ID .abc@abc.com is Valid :"+d1.Validate(".abc@abc.com"));
		System.out.println("The ID abc()*@gmail.com is Valid :"+d1.Validate("abc()*@gmail.com"));
		System.out.println("The ID abc@%*.com is Valid :"+d1.Validate("abc@%*.com"));
		System.out.println("The ID abc..2002@gmail.com is Valid :"+d1.Validate("abc..2002@gmail.com"));
		System.out.println("The ID abc.@gmail.com is Valid :"+d1.Validate("abc.@gmail.com"));
		System.out.println("The ID abc@abc@gmail.com is Valid :"+d1.Validate("abc@abc@gmail.com"));
		System.out.println("The ID abc@gmail.com.1a is Valid :"+d1.Validate("abc@gmail.com.1a"));
		System.out.println("The ID abc@gmail.com.aa.au is Valid :"+d1.Validate("abc@gmail.com.aa.au"));
	}

}
