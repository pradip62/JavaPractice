package com.inspire.string;

public class StringToArrayy {

	public static void main(String[] args) {
		String s = "i am java";

		String st[] = s.split(" ");
		System.out.println(st.length);//3
		System.out.println(st[2]);  //java
		
		for (String i:st)
		{
			System.out.print(i+" ");  //i am java
		}

	}

}
