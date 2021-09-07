package com.bridgelabz.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	private static boolean validateEmail(String email) {
		String regex = "([a-zA-Z][a-zA-Z0-9_-]*[a-z|A-Z|0-9])(([+-_.][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]*)([.])([a-z]{2,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Email: ");
		String email = scanner.nextLine();
		if(validateEmail(email))
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");
		scanner.close();		
	}

}
