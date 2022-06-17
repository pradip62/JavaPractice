
public class primeNumber {

	static void checkPrime()

	{
		int n = 28, count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

	public static void main(String[] args) {
		checkPrime();
	}

}
