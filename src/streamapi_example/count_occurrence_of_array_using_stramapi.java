package streamapi_example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class count_occurrence_of_array_using_stramapi {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,1,5,3,4,3,1,5};
		Arrays.stream(arr).boxed()
			.collect(Collectors.groupingBy(s->s))
				.forEach((k,v)->System.out.println(k+" "+v.size()));
	
	}
}
