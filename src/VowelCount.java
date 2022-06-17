
public class VowelCount {

	public static void main(String[] args) {
//		String s = "pradip";
//		int vcount = 0, c_count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'a'
//					|| s.charAt(i) == 'e'|| s.charAt(i) == 'u') {
//				vcount++;
//			} else {
//				c_count++;
//			}
//		}
//		System.out.println("vowelCount= " + vcount);
//		System.out.println("Consonent Count= " + c_count);
 
		String s = "pradip";
		char a[]=s.toCharArray();
		int vc=0;
		int cc=0;
		for(char b:a)
		{
			if(b=='i'|| b== 'a' ||b=='e'||b=='o'||b=='u')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println("vowel count  "+vc);
		System.out.println("Consonent Count= " + cc);
	}

}
