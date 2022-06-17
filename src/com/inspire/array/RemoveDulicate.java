package com.inspire.array;

import java.util.HashSet;

public class RemoveDulicate {

	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9 };
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int b : a)
		{
              hs.add(b);
		}
		System.out.println(hs);

	}

}
