
public class IndexOfString {

	public static void main(String[] args) {
	String  s="my name pradip ";
	
	System.out.println(s.indexOf('p'));//8
	System.out.println(s.lastIndexOf('p'));//13
	System.out.println(s.contains("r"));//true
	System.out.println(s.contains("my name"));//true
	System.out.println(s.contains("myname"));//false
	System.out.println(s.contains("my"));// true
	System.out.println(s.startsWith("m"));//true
	System.out.println(s.endsWith("m"));//false

	}

}
