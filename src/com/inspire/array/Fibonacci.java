package com.inspire.array;

public class Fibonacci {

	public static void main(String[] args) {
	
		int a=0,b=1,c;
		//a+b c
		//0 1 1 2 3 5
		//  a b
		
		for(int i=0;i<10;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
