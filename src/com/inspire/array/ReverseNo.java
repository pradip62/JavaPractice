package com.inspire.array;

public class ReverseNo {

	public static void main(String[] args) {

		int n = 1221;
		int temp = n;
		int last = 0, sum = 0;
		while (n > 0) {
			last = n % 10;
			sum = sum * 10 + last;
			n = n / 10;
		}
		System.out.println("reverseno " + sum);
		if (temp == sum)
		{
			System.out.println("number is palindrome");
		}
		else

		{
			System.out.println("not palindrome");
		}
	}

}
