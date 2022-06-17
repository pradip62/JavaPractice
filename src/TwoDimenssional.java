
public class TwoDimenssional {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length + 2; j++) // a[i].length also works
				                                    //a.length is 2..+2=4 columns
			{

				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
