package streamapi_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//How to find duplicate elements in a stream
// Input: {1,2,3,4,2,5,4}
//Output: {2,4}

public class Find_DuplicateElement_Stream {

	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,2,5,4);
		System.out.println(list);
		Set< Integer> set=new HashSet<>();
		List<Integer> duplicatevalue= list.stream().filter(num->!set.add(num)).collect(Collectors.toList());
	    System.out.println(duplicatevalue);
	    
	  
	}
}
