package Collection_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapSetList {

	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		mh.add("Mumbai");
		mh.add("Pune");
		
		List<String> mp=new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
		Set<List<String>> india=new HashSet<>();
		india.add(mh);
		india.add(mp);
		
		List<String> state1=new ArrayList<>();
		state1.add("City1");
		state1.add("City2");
		
		List<String> state2=new ArrayList<>();
		state2.add("City3");
		state2.add("City4");

		Set<List<String>> japan=new HashSet<>();
		japan.add(state1);
		japan.add(state2);

		Map<Integer, Set<List<String>>> world=new HashMap<>();
		world.put(1, india);
		world.put(2, japan);
		
		Set<Integer> keys=world.keySet();
		
		//using Iterator through
		Iterator<Integer> itr= keys.iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		System.out.println(key);
		Set<List<String>> sls= world.get(key);
		Iterator<List<String>> itr2=sls.iterator();
		while(itr2.hasNext())
		{
		List<String> ls=	itr2.next();
		Iterator<String> itr3=ls.iterator();
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
			Set<List<String>> sls=	world.get(key);
			for(List<String> s:sls)
			{
				for(String name:s)
				{
					System.out.println(name);
				}
			}
		}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		
		keys.forEach((key)->{
			System.out.println(key);
			Set<List<String>> sls=	world.get(key);
			sls.forEach((ls)->{
				List<String> lis=ls;
				lis.forEach((name)->{
					System.out.println(name);
				});
			});
		});
		
		
		
		
	}
}
