
public class LeapYear {

	public static void main(String[] args) {

		int n = 1700;
		if (n % 4 == 0) 
		{
			if (n % 100 == 0) 
			{
				if (n % 400 == 0) 
				{
					System.out.println("its leap year");
				} else 
				{
					System.out.println("its not leap year");
				}
			} 
			else
			{
				System.out.println("its leap year");
			}
		}
		else 
		{
		System.out.println("not leap year");
		}
	}

}
