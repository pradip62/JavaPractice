package oops.abstraction;

public class MainC {

	public static void main(String[] args) {
		/*
		 * Abstraction u1=new UseAbstract(); 
		 * u1.sum();                           //when reference is of parent class,
		 *                                     //we can access only parent class method
		 */
		
		UseAbstract u=new UseAbstract();
		u.add();
		u.sum();

	}

}
