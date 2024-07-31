package Collection_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMap {

	public static void main(String[] args) {
		
		Map m=new HashMap<>();
		m.put(1, "Raj");
		m.put(2, "Sagar");
		m.put(3, "Ashish");
		m.put(4, "Kunal");

		Map<Integer, Map> map=new HashMap<>();
		map.put(1, m);
		
		Set<Integer> keys=map.keySet();
		
		//using Iterator through
	Iterator<Integer> itr=	keys.iterator();
	while(itr.hasNext())
	{
	int key=	itr.next();
	System.out.println(key);
	Map mm=	map.get(key);
	 Set<Integer> key1= mm.keySet();
	Iterator<Integer> itr2= key1.iterator();
	while(itr2.hasNext())
	{
		int k=itr2.next();
		System.out.println(k);
	String val=	(String) mm.get(k);
	System.out.println(val);
	}
	 
	}
		
		System.out.println("****************");
		//using for loop through
		for(int key:keys)
		{
			System.out.println(key);
		Map mm=	map.get(key);
		Set<Integer> k=mm.keySet();
		for(int key1:k)
		{
			System.out.println(key1);
		String val=	(String) mm.get(key1);
		System.out.println(val);
		}
		}
		
		
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		
		keys.forEach((key)->{
			System.out.println(key);
		Map mm=	map.get(key);
		Set<Integer> k=mm.keySet();
		k.forEach((kk)->{
			System.out.println(kk);
		String val=(String) mm.get(kk);
		System.out.println(val);
		
		});
		});
		
	}
}
