
public class SumOfArray {

	public static void main(String[] args) {
	 int a[]=new int[3];
       a[0]=3;
       a[1]=4;
       a[2]=5;
      // a[3]=6;
       //int arr[]= {1,2,34,5};
       int sum = 0;
       for(int i=0;i<=a.length-1;i++) //OR  ( int i=0;i<a.length;i++)
       {
    	   sum=sum+a[i];
       }
       System.out.println(sum);
       
	}

}
