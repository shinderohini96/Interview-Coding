package array;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {6,8,2,4,3,1,5,7,9};
	
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second largest value is: "+a[1]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
/*		
 	int a[]= {6,8,2,4,3,1,5,7,9};
 	int largest=Integer.MIN_VALUE;
	int second_largest=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			second_largest=largest;
			largest=a[i];
		}
		else if(a[i]>second_largest && a[i]!=largest)
		{
			second_largest=a[i];
		}
	}

	System.out.println("second largest value is: "+second_largest);
	
	*/
	} 
}
