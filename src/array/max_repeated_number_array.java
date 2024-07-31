package array;

public class max_repeated_number_array {

	public static void main(String[] args) {
		
		int arr[]= {5,2,4,5,5,5,4,6,2,5,5,5};
		int element=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
			if(count > max)
			{
				max=count;
				element=arr[i];
			}
		}
		
		System.out.println("Elements:"+element+" "+"Count: "+max);
		
		
	}
}
