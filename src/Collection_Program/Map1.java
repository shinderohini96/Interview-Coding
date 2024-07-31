package Collection_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "kunal");
		map.put(2, "ashish");
		map.put(3, "vinay");
		map.put(4, "pranav");
		map.put(5, "om");

		Set<Integer> keys=map.keySet();
		//using Iterator through
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		System.out.println(key);
		String x=	map.get(key);
		System.out.println(x);
		}
		
		
		System.out.println("****************");
		//using for loop through
		for(int key:keys)
		{
			System.out.println(key);
		String x=	map.get(key);
		System.out.println(x);
		}
		
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		keys.forEach((key)->{
			System.out.println(key);
			String name=map.get(key);
			System.out.println(name);
		});
	}
}
