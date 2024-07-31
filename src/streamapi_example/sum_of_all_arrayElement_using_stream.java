package streamapi_example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sum_of_all_arrayElement_using_stream {

	public static void main(String[] args) {
		
		
		int arr[]= {2,3,4,5,7};
		
		int sum=	Arrays.stream(arr).sum();
		System.out.println(sum);
		
	int sum1=	IntStream.of(arr).sum();
	System.out.println(sum1);
	
	int sum2=		Arrays.stream(arr).reduce(Integer::sum).getAsInt();
	System.out.println(sum2);
	
	int sum3=		Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
	System.out.println(sum3);
	
	
	int arr1[]= {2,4};
	int arr2[]= {3,6};
	int result[]=new int[arr1.length];
	Arrays.setAll(result,i->arr1[i]+arr2[i]);
	System.out.println(result);
	}
}
