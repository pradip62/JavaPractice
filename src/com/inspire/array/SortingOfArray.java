package com.inspire.array;

public class SortingOfArray {

	public static void main(String[] args) {
		int a[] = { 2, 9, 3, 6, 5, 8, 7 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(" ascending order  " + a[i]);
		}

		for (int i = a.length - 1; i >= 0; i--)
		{
			System.out.println(" descending order  " + a[i]);
		}

	}

}
