
public class ThirdWordRev {

	public static void main(String[] args) {

		String s = "I am Prakash  and am looking for exciting work ";
		String words[] = s.split(" ");
		// System.out.println(words[2]);
		for (int i = 0; i < words.length; i++) 
		{
			if (i == 2 || i == 6 || i == 9)
			{

				String s1 = words[i];
				for(int j=s1.length()-1;j>=0;j--)
				{
					System.out.print(s1.charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(words[i] +" ");
			}
		}

	}

}
