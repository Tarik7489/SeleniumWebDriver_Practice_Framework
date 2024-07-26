package com.automation;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int originalNumber = 12345;
		
	//convert number to string 
		
		String convertToSting = String.valueOf(originalNumber);
		
		
		//reverse the string using String builder
		
		StringBuilder builder = new StringBuilder(convertToSting);
		
		String reverse = builder.reverse().toString();
		
		
		//conver string to interger
		
		int convertToInteger = Integer.parseInt(reverse);
		
		System.out.println(convertToInteger);
	}

}
