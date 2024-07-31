package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		Set<List<String>> set=new HashSet<>();
		set.add(list);
		
		//using Iterator through
	Iterator<List<String>>	itr=set.iterator();
	while(itr.hasNext())
	{
	List<String> ls=	itr.next();
	Iterator<String> itr2=ls.iterator();
	while(itr2.hasNext())
	{
	String name=	itr2.next();
	System.out.println(name);
	}
	}
	
	System.out.println("**************");
	//using for loop through
	for(List<String> ls:set)
	{
		for(String s:ls)
		{
			System.out.println(s);
		}
	}
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		
		set.forEach((sl)->{
			List<String> list1=sl;
			list1.forEach((l)->{
				System.out.println(l);
			});
		});
	}
}
