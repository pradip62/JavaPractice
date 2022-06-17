package com.inspire.string;

public class StringReverse {

	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		sr.reversUsingFor();
	}

	public void reversUsingFor() {
		String s ="I am java";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i)); // 
		}
	}
	

}
