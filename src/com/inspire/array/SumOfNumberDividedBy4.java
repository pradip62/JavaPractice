package com.inspire.array;

public class SumOfNumberDividedBy4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i = i + 4) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
