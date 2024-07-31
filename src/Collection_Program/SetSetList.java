package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetSetList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("abc");
		list.add("pqr");
		list.add("lmn");
		list.add("xyz");

		Set<List<String>> set=new HashSet<>();
		set.add(list);
		
		Set<Set<List<String>>> set1=new HashSet<>();
		set1.add(set);
		
		//using Iterator through
		Iterator<Set<List<String>>> itr=set1.iterator();
		while(itr.hasNext())
		{
			Set<List<String>> sls=itr.next();
			Iterator<List<String>> itr2=sls.iterator();
			while(itr2.hasNext())
			{
				List<String> ls=itr2.next();
				Iterator<String> itr3=ls.iterator();
				while(itr3.hasNext())
				{
					String name=itr3.next();
					System.out.println(name);
				}
			}
		}
		
		System.out.println("**************");
		//using for loop through
		for(Set<List<String>> sl:set1)
		{
			for(List<String> ls:sl)
			{
				for(String name:ls)
				{
					System.out.println(name);
				}
			}
		}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		set1.forEach((x)->{
			Set<List<String>> se=x;
			se.forEach((s1)->{
				List<String> lis=s1;
				lis.forEach((name)->{
					System.out.println(name);
				});
				
			});
		});
	}
}
