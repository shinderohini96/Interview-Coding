package array;

public class SecondSmallest {

	public static void main(String[] args) {
		int a[]= {6,8,2,4,3,1,5,7,9};
		int smallest=Integer.MAX_VALUE;
	int second_smallest=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<smallest)
		{
			second_smallest=smallest;
			smallest=a[i];
		}
		else if(a[i]<second_smallest && a[i]!=smallest)
		{
			second_smallest=a[i];
		}
	}

	System.out.println("second smallest value is: "+second_smallest);
	}

}
