package Collection_Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapValues {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 5);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 2);
		
	LinkedHashMap<String, Integer> sortmap=	map.entrySet().stream().sorted((t1,t2)->t1.getValue()
				.compareTo(t2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(t1,t2)->t1,LinkedHashMap::new));
		
			
	
	
		System.out.println(sortmap);
	}
}
