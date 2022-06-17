
public class StringVowelConsonent {

	public static void main(String[] args) {
		String s = "pradip";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
					s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'u')
			{

				System.out.println("vowels " + s.charAt(i));
			}
			else {
				System.out.println("consonents  " + s.charAt(i));
			}
		}

	}

}
