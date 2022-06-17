
public class LowerCount {

	public static void main(String[] args) {
		String s = "PRadIp";
		int uc = 0, lc = 0;
//		int c1 = 'a';
//		System.out.println(c1);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				uc++;
			} else {
				lc++;
			}

			/*
			 * if (c >= 65 && c <= 87) { uc++; } else { lc++; }
			 */
		}
		System.out.println("uppercase count =" + uc + "" + "lowercase count =" + lc);

	}

}
