package com.automation;
public class ReverseString {
    public static void main(String[] args) {
       
    	
    	String originalString = "Tarik";
    	
    	//Using string builder
    	
    	StringBuilder builder = new StringBuilder(originalString);
    	
    	String reverse = builder.reverse().toString();
    	
    	System.out.println("Reverse the given string :"+ reverse);
    }
}
