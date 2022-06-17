package com.inspire.inheritance;

public class Main {

	public static void main(String[] args) {

		Child c = new Child();//child run
		Parent p = new Parent();//parent run
		Parent p1 = new Child();// child run
		
		//Child c1= new Parent();   ///this is not possible
		
		
		// c.run();
		//p.run();
		//p1.run();
		//c1.run();
		
	}

}
