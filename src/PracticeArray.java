
public class PracticeArray {

	public static void main(String[] args) {
		
		String s1="fggkgk";
		System.out.println(s1.length());//6
		System.out.println(s1.charAt(3));//k
		
		
		String s[] = { "paaa", "aj", "sj" };
		System.out.println(s[0].length());// 4
		for (String i : s) {
			System.out.println(i);
		}
//	s.foreach(s->System.out::println(s));

		int a[] = { 11, 2, 3, 41, 5 };
		System.out.println(a.length);// 5
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);//11 2 3 41 5
		}

	}

}
