
public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=5,b=10;
		
		a=a+b;    //a=15
		b=a-b;     //     15-10    b=5
		a=a-b;     // a=10
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);

	}

}
