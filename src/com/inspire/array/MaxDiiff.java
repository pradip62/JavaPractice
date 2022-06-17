package com.inspire.array;

import java.util.Arrays;
import java.util.Collections;

public class MaxDiiff {

	public static void main(String[] args) {

		Integer a[] = { 2, 3, 11, 4, 5, 6, 7, 22, 8, 9 };
		Arrays.sort(a,Collections.reverseOrder());

		System.out.println(a[0]); //22
		
		int maxdiff = a[0]-a[a.length -1];
		System.out.println(maxdiff);
		
	}

}
