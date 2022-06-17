
public class LeapYearPractice {

	public static void main(String[] args) {
	
		int n=1709;
	
		
		if(n%4==0)
		{
			if(n%100==0) 
			{
				if(n%400==0)
				{
					System.out.println("leap year");
				}
				else 
				{
					System.out.println("not leap");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
		System.out.println("not leap");	
		}

	}

}
