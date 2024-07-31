package streamapi_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class evenNumber_List {

/*	Filter even number from List using java 8.
    Input : 1,2,3,4,5,6,7,8,9,10	
    Output:	Even Numbers: [1, 3, 5, 7, 9]
	*/
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> evennumber=	list.stream().filter(num->num % 2==0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+evennumber);
	}
}
