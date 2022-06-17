package com.inspire.string;

public class IntactReverseString {

	public static void main(String[] args) {

		String s = "i am using java";
//expected o/p-->  a va  jgnis umai
		char input[] = s.toCharArray(); // c1[0]=i c1[1]=' '
		char result[] = new char[input.length];

		for (int i = 0; i < input.length; i++)
		{
			if (input[i] == ' ') 
			{
				result[i] = ' ';
			}

		}
		
		int j=input.length-1;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=' ')
			{
				if(result[j]==' ')
				{
					j--;
				}
				result[j]=input[i];
				j--;
				
			}
			
		}
		System.out.println(String.valueOf(result));
		
		

	}

}
