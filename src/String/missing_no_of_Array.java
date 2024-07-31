package String;

public class missing_no_of_Array {

	public static void main(String[] args) {
		 
		int arr[]= {1,2,3,4,6,7,8,9,10};   // 5 number missing
		
		int sum=(10*11)/2;     //   (n*n+1)/2
		int actualsum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			actualsum=actualsum +arr[i];
			
		}
		
		System.out.println("Missing number of array : "+(sum-actualsum));
		
	}
}

/*
//OUTPUT

Missing number of array : 5

*/
