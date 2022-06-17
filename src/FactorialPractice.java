
public class FactorialPractice {

	public static void main(String[] args) {
		// 5 factorial=5*4*3*2*1=120
		
		int n =5,factorial=1;
		for (int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
System.out.println(factorial);
	}

}
