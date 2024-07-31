package Collection_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("aaa");
		list.add("ccc");
		list.add("bbb");
		list.add("ddd");
		
		Map<Integer, List<String>> map=new HashMap<>();
		map.put(1, list);
		
		Set<Integer> keys=map.keySet();
		
		//using Iterator through
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		System.out.println(key);
		List<String> lis=	map.get(key);
		Iterator<String> itr2=lis.iterator();
		while(itr2.hasNext())
		{
		String name=	itr2.next();
		System.out.println(name);
		}
		}
		
		System.out.println("****************");
		//using for loop through
		for(int key:keys)
		{
			System.out.println(key);
		List<String> lis=	map.get(key);
		for(String name:lis)
		{
			System.out.println(name);
		}
		}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		
		keys.forEach((key)->{
			System.out.println(key);
		List<String> lis=	map.get(key);
		lis.forEach((name)->{
			System.out.println(name);
		});
		});
	}
}
