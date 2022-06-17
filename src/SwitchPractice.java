import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = sc.nextInt();
		System.out.println("enter 2nd no");
		int b = sc.nextInt();
		//Scanner sc2 = new Scanner(System.in);   for   sc2.nextLine()
		System.out.println("enter opration to be perform");
		String operation = sc.next();
           switch(operation)
           {
           case "add":System.out.println(a+b);
           break;
           case "sub":System.out.println(a-b);
           break;
           case "mul":System.out.println(a*b);
           break;
           case "div":System.out.println(a/b);
           break;
           default:System.out.println("error");
           }
	
	}

}
