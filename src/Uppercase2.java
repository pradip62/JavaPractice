
public class Uppercase2 {

	public static void main(String[] args) {
		String s="PRaDiP";
		char c[]=s.toCharArray();
		
		for(char a: c)
		{
		
			if(a>='A' && a<='Z')
			{
				
		System.out.println("capital letters  "+a);
			}
			else {
				System.out.println("small letters "+a);
			}
		}

	}

}
