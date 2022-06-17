package com.inspire.string;

public class StringRevUsingCharArray {

	public static void main(String[] args) {
		String s = "selenium";
		//System.out.println(s.indexOf('e'));
		char c[] = s.toCharArray();  //convert string to char array
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]); // muineles
		}

	}

}
