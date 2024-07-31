package Collection_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("kunal");
		list.add("vijay");
		list.add("pritam");
		list.add("jibhau");
		list.add("vinay");
		
		List<List<String>> list2=new ArrayList<>();
		list2.add(list);
		
		// using Iterator through
		Iterator<List<String>> itr=list2.iterator();
		while(itr.hasNext())
		{
			List<String> l=itr.next();
		Iterator<String> itr1=	l.iterator();
		while(itr1.hasNext())
		{
			String s=itr1.next();
			System.out.println(s);
		}
		}
		
		System.out.println("***************");
		// using for through
		for(List<String> l:list2)
		{
			for(String s:l)
			{
				System.out.println(s);
			}
		}
		
		System.out.println("***************");
		// using forEach through
		list2.forEach((x)->{
			List<String> l=x;
			l.forEach((s)->{
				System.out.println(s);
			});
		});
		
		

	}
}
