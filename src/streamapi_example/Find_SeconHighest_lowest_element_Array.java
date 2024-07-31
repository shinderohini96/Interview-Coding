package streamapi_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_SeconHighest_lowest_element_Array {
	
public static void main(String[] args) {
	
	System.out.println("*********** In Array ************");
	
	int arr[]= {13,24,30,50,45,40,20,10,12};
	
	//Second Highest array Element
		int x=Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()). skip(1).findFirst().get();
		System.out.println(x);
		
	// Highest array Element
		int val=Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(val);
		
	//Second Lowest array Element
			int val1=Arrays.stream(arr).distinct().boxed().sorted().skip(1).findFirst().get();
			System.out.println(val1);
		
	// Lowest array Element
			int val2=Arrays.stream(arr).distinct().boxed().sorted().findFirst().get();
			System.out.println(val2);
	
	// 3rd highest value in array
			int thirdHigh=Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()). skip(2).findFirst().get();
			System.out.println(thirdHigh);
			
	
}
}
