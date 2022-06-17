package com.inspire.string;

public class StringRevUsingArray {

	public static void main(String[] args) {
		String s = "i am java";
        String st[] = s.split(" ");
	 for(int i=st.length-1;i>=0;i--)
	 {
		 System.out.print(st[i]+" ");
	 }
	}

}
