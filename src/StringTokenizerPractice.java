import java.util.StringTokenizer;

public class StringTokenizerPractice {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("i am using java");
		while (s.hasMoreElements()) {

			String s1 = s.nextToken();
			System.out.println(s1);

			if (s1.equals("java")) {
				System.out.println("last word of the " + s1);
			}
		}

	}

}
