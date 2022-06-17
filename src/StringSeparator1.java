import java.util.Scanner;

public class StringSeparator1 {

	public static void main(String[] args) {
		
		
	Scanner scan= new Scanner(System.in);	
	System.out.println("enter string");
	String s=scan.nextLine();
	System.out.println("name without digits   "+s.replaceAll("[^A-Za-z]", ""));
		
	

	}

}
