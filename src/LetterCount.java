
public class LetterCount {

	public static void main(String[] args) {
		String s = "pradip";
		/*
		 * String q="22"; int a=Integer.parseInt(q); System.out.println("22 is ="+a);
		 */
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			for (int j = 0; j < s.length(); j++) {

				if (c == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i) + " = " + count);
			count = 0;
		}

	}

}
