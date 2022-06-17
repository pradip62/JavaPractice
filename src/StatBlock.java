
public class StatBlock {
	/*
	 * 1. static block 2.main method 3.iib 4.constructor 
	 * 
	 * 5. non static method or static method 
	 * follows given sequence
	 */

	public static void main(String[] args) {
		System.out.println("main method");
		StatBlock s = new StatBlock();
		s.add();
		stat();
	}

	static {System.out.println("static block");}

	static void stat() {System.out.println("static method");}

	void add() {System.out.println("non static method");}

	public StatBlock() {System.out.println("constructor");}

	{
		System.out.println("iib");
	}

}
