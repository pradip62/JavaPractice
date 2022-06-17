package com.inspire.array;

import java.util.TreeSet;

public class FirstLast {

	public static void main(String[] args) {
		int a[]= {4,7,1,1,1,2,3,4,4,5,5,6,6,6,7,7,7,8,9,9,0,0,2};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			ts.add(a[i]);
		}
		System.out.println("array without duplicate ===>" +ts);
         System.out.println("smallest value  ==>"+ts.first());
         System.out.println("largest value  ==>"+ts.last());
	}

}
