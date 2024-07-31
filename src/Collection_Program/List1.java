package Collection_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("kunal");
		list.add("vijay");
		list.add("pritam");
		list.add("jibhau");
		list.add("vinay");

		//using Iterator through
	Iterator<String> itr=	list.iterator();
	while(itr.hasNext())
	{
		String s=itr.next();
		System.out.println(s);
	}
		
	System.out.println("**********************");
	//using for through
	for(String n:list)
	{
		System.out.println(n);
	}
	
	System.out.println("**********************");
	//using forEach through
	list.forEach((s)->{
		System.out.println(s);
	});
	
	System.out.println("**********************");
	list.forEach((ss)->System.out.println(ss));
	}
	
}
