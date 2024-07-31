package Collection_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapListSet {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<>();
		set.add("Ravindra");
		set.add("Dhoni");
		set.add("Mahendra");
		set.add("Rahul");
		set.add("Virat");
		set.add("Kunal");
		set.add("Sachin");
		set.add("Yuvaraj");

		List<Set<String>> list=new ArrayList<>();
		list.add(set);
		
		Map<Integer	, List<Set<String>>> map=new HashMap<>();
		map.put(1, list);
		
		Set<Integer> keys=map.keySet();
		
		//using Iterator through
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		System.out.println(key);
		List<Set<String>> lss=map.get(key);
		Iterator<Set<String>> itr2=lss.iterator();
		while(itr2.hasNext())
		{
			Set<String> ss=itr2.next();
		Iterator<String> itr3=	ss.iterator();
		while(itr3.hasNext())
		{
		String name=	itr3.next();
		System.out.println(name);
		}
		}
		}
		
		System.out.println("****************");
		//using for loop through
		for(int key:keys)
		{
			System.out.println(key);
			 List<Set<String>> lss=	map.get(key);
			 for(Set<String> ls:lss)
			 {
				 for(String name:ls)
				 {
				 System.out.println(name);
				 }
			 }
		}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		
		keys.forEach((key)->{
			System.out.println(key);
			List<Set<String>> lss=	map.get(key);
			lss.forEach((ss)->{
				Set<String> s=ss;
				s.forEach((name)->{
					System.out.println(name);
				});
			});
		});
	}
}
