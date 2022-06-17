package com.inspire.string;

public class IntactReverse {

	public static void main(String[] args) {
	String s= "i am using java";
	char c1[]=s.toCharArray();  //convert string to char array
	char c2[]=new char[c1.length];  //create emty array to store reverse sting
	
	// add spaces of c1 to c2
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]==' ')
		{
			c2[i]=' ';
		}
	}
	
	int j=c1.length-1;
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]!=' ')      
		{
			if(c2[j]==' ')
			{
				j--;
			}
			c2[j]=c1[i];
			j--;
		}
		
	}
	System.out.println(String.valueOf(c2));

	}

}
