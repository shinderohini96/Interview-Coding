package Collection_Program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSet {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("abc");
		set.add("xyz");
		set.add("pqr");
		
		Map<Integer, Set<String>> map=new HashMap<>();
		map.put(1, set);
		
		Set<Integer> keys=map.keySet();
		
		//using Iterator through
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		System.out.println(key);
		Set<String> se=map.get(key);
		Iterator<String> itr2=	se.iterator();
		while(itr2.hasNext())
		{
			String name=	itr2.next();
			System.out.println(name);
		}
		}
		
	System.out.println("****************");
//		//using for loop through
		
		for(int key:keys)
		{
			System.out.println(key);
			Set<String> se=	map.get(key);
			for(String name:se)
			{
				System.out.println(name);
			}
		}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		keys.forEach((key)->{
			System.out.println(key);
			Set<String> se=map.get(key);
			se.forEach((name)->{
				System.out.println(name);
			});
			
		});
	}
}
