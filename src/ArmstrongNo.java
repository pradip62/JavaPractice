
public class ArmstrongNo {

	public static void main(String[] args) {
		int n = 153, last, sum = 0, temp;
		temp = n;
		while (n > 0) {
			last = n % 10;     // 153 % 10 = 3                                   ,15 % 10 = 5  
			
			sum = sum + last * last * last;     //sum=0+3*3*3=27
			n = n / 10;     //n=153/10=15
		}

		if (sum == temp) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
