
public class Coversion {

	public static void main(String[] args) {
		int a=1234;
		String s = String.valueOf(a);/*  valueOf is static method ,which converts
										    int ,float,double to string
										 */
		System.out.println(s);
		
		String s2="12";
		int b=Integer.parseInt(s2);//String to integer using parseInt method
		System.out.println(b);
		Double g=Double.parseDouble(s2); //String to double
		System.out.println(g);

		String s1=s2.concat(s); //concatenation
		System.out.println(s1);
		
		String p="pradip";
		String x="@";
		String y="admin";
         String w="123";
         String z=p+y+x+w; //concatenation using +
         System.out.println(z);
         System.out.println(y.toUpperCase());
         
        /* charAt(),toUpperCase(),toLowerCase(),equals,equalsIgnorCase(),
         * concat(),length(),valueOf(),replace(),replaceAll(),
         * indexOf(),
         * 
         * */
         
         Float f=7.2f;
         String d=String.valueOf(f);
         System.out.println(d);
	}

}
