
public class Separators {

	public static void main(String[] args) {
		String s = "i am using java ";

		/*
		 * String vowels=s.replaceAll("[^aeiou]", "");
		 * System.out.println("vowels in string   ="+vowels);
		 * 
		 * String consonents=s.replaceAll("[^qwrtypsdfghjklzxcvbnm]", "");
		 * System.out.println("consonent in string   ="+consonents);
		 */

		String s2 = s.replaceAll("[^aeiou]", "");
		System.out.println("vowel count" + s2.length());

		String s3 = s.replaceAll("[^bcdfghjklmnpqrstvwxyz]", "");
		System.out.println("consonent count" + s3.length());

	}

}
