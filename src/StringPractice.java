
public class StringPractice {

	public static void main(String[] args) {
		String s="pradip";
		String s1="pradip";
		System.out.println(s==s1);              //true
		System.out.println(s.equals(s1));     //true
		
		String s2= new String("pradip");
		System.out.println(s2.equals(s));//true
		System.out.println(s2.equals(s1)); //true
		System.out.println(s2==s); //false
		System.out.println(s2==s1); //false
		
	}

}
