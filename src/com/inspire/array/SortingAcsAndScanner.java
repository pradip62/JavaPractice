package com.inspire.array;

import java.util.Scanner;

public class SortingAcsAndScanner {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter element of array");
		int a[]=new int[6] ;
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
        for (int i = 0; i < a.length; i++)
		{
                      System.out.println(a[i]);
		}
	}
}
