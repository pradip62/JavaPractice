
public class Parseint {

	public static void main(String[] args) {
		String s1="200";
		
		//int k=s1/2;   we can not perform arithmetic operation on string
		//so we have to convert it to Integer
		
		//int j=new Integer(s1).intValue();
		int j= Integer.parseInt(s1);
		
// line no 10 covert s1 string to Integer...and its value is stored in variable j	
		//now we can perform mathematical operation

		System.out.println(j/2);
	}

}
