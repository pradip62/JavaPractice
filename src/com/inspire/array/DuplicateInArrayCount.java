package com.inspire.array;

public class DuplicateInArrayCount {

	public static void main(String[] args) {
    int a[]= {2, 3, 4, 4, 5, 5};
    
    System.out.println("duplicate elements");
    
    for(int i=0;i<a.length;i++)
    {
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 if (a[i]==a[j])
    		 {
    			 System.out.println(a[i]);
    		 }
    	 }
    }

	}

}
