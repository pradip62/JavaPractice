
public class StringSeparator {

	public static void main(String[] args) {
		String s = "my12@ i*8";
//
//		System.out.println("digits = " + s.replaceAll("[^0-9]", ""));
//		System.out.println("Alphabates = " + s.replaceAll("[^a-zA-Z]", ""));
//		System.out.println("Specialchrachter = " + s.replaceAll("[^@* #]", ""));
//		System.out.println("vowel " + s.replaceAll("[^aeiou]", ""));
//		System.out.println("consonents " + s.replaceAll("[^qwrtypsdfghjklzxcvbnm]", ""));

		// String r = s.replaceAll("[^0-9]", "");
		// System.out.println("digits" + r);

		 String a="pradip@100";
		 System.out.println("special char  "+a.replaceAll("[^@# *&]", ""));
		 System.out.println("alphabates  "+a.replaceAll("[^A-Za-z]", ""));
		 System.out.println("numbers  "+a.replaceAll("[^0-9]", ""));
		 String b=a.replaceAll("[^0-9]", "");
		 int c=Integer.parseInt(b); //separate number from string.convert to int.perform division
		 System.out.println(c/10);
		 
		
		
		
	}

}
