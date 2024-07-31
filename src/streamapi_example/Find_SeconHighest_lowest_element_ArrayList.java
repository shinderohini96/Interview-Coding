package streamapi_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_SeconHighest_lowest_element_ArrayList {
	
public static void main(String[] args) {
	

	System.out.println("*********** In ArrayList ************");
	
	List<Integer> list=Arrays.asList(13,24,30,50,20,10,12);
	
	//Highest Element
			int Lar=list.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
			System.out.println(Lar);
			
			// OR (Use -> comparator or collections)
			int largest=	list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
				System.out.println(largest);
				
	//Second Highest Element
			int LarSec=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
			System.out.println(LarSec);
				
				
	//Lowest Element
			int SecL=list.stream().sorted().distinct().findFirst().get();
			System.out.println(SecL);
	
	//Second Lowest Element
			int SecL1=list.stream().sorted().distinct().skip(1).findFirst().get();
			System.out.println(SecL1);
		
		
		
			
		
		
}
}
