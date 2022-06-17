
public class UpperCount {

	public static void main(String[] args) {
		String s = "PradDip";
		
		String s1 = s.replaceAll("[^A-Z]", "");
		System.out.println("capital letters count " + s1.length());

		String s2 = s.replaceAll("[^a-z]", "");
		System.out.println("small letters count " + s2.length());
		/*
		 * int c='a'; System.out.println(c);
		 */
	}

}
