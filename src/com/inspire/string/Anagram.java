package com.inspire.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Grab";
		String s2 = "Brag";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length())
		{
			System.out.println(" strings are not anagram");
		}
		else {

			    char c1[] = s1.toCharArray();
			    char c2[] = s2.toCharArray();

			    Arrays.sort(c1);
		     	Arrays.sort(c2);

			      if (Arrays.equals(c1, c2))
			           {
				           System.out.println("angram");
			           }
			      else
			           {
				           System.out.println("not anagram");
			           }
		}
	}

}
