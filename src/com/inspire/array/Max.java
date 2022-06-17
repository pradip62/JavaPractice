package com.inspire.array;

public class Max {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8 };
		int max = 0;

//		for (int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
		for(int i:a)
		{
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println(max);
	}

}
