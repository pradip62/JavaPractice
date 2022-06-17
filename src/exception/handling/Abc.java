package exception.handling;

public class Abc {

	public static void main(String[] args) {
		try {
			int n = 10 / 0;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		catch (Exception e) { 
			System.out.println("caught in exception");
			System.out.println(e);
			String s=e.getMessage();
			System.out.println(e.getMessage());
			System.out.println("this is "+s);
			e.printStackTrace();
		} 
		 
		
	}

}
