package com.inspire.array;

import java.util.ArrayList;

public class CopyCommonDigitToThirdArray {

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 41,2 };
		int b[] = { 2, 4, 6, 8, 9 };
		ArrayList<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i] == b[j])
				{
					l.add(a[i]);
				}
			}
		}
		System.out.println(l.size());
		System.out.println(l);
	}

}
