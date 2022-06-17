package com.inspire.string;

public class Separator {

	public static void main(String[] args) {
	
		
		String  s="Laxman@123";

		System.out.println("alphabates in string ===== "+s.replaceAll("[^A-Za-z]", ""));
		System.out.println("digits in string  ====="+s.replaceAll("[^0-9]", ""));
		System.out.println("special char in string  ===== "+s.replaceAll("[^@* &#]", ""));
		
	}

}
