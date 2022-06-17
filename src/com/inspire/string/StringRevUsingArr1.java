package com.inspire.string;

public class StringRevUsingArr1 {
	public static void main(String[] args) {
		String str = "lets do coding";
		String sp[] = str.split(" ");
		for (int i = 0; i < sp.length; i++) {
			String sw = sp[i];
			for (int j = sw.length() - 1; j >= 0; j--) {
				System.out.print(sw.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
