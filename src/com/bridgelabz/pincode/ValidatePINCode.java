package com.bridgelabz.pincode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePINCode {

	private static boolean validatePINCode(String pinCode) {
		String regex = "(^[0-9]{3})([\\s]?)([0-9]{3}$)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pinCode);
		return matcher.matches();
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the PIN code: ");
		String pinCode = scanner.nextLine();
		if(validatePINCode(pinCode))
			System.out.println("PIN code is valid");
		else
			System.out.println("PIN code is not valid");
		scanner.close();		
	}
}
