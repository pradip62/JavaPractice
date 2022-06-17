package com.inspire.inheritance;

public class Static_IIB_Constructor extends test {
	Static_IIB_Constructor()
	{
		System.out.println("child constructor");
	}
	static
	{
	System.out.println("child static block");
	}
	 public void test1()
	{
	 	System.out.println("child class method");
	}
	 {System.out.println("child iib");}

	public static void main(String[] args) {
		System.out.println("main");
		Static_IIB_Constructor a=new Static_IIB_Constructor();
		a.test1();
		
    }
}
class test
{
	test()
	{
		System.out.println("parent con");
	}
	static
	{
	System.out.println("parent static block");
	}
	 public void test1()
	{
		System.out.println("parent class method");
	}

	 {System.out.println("parent iib");}
}
