package Collection_Program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetSet {

	public static void main(String[] args) {
		
		Set<String> city=new HashSet<>();
		city.add("pune");
		city.add("mumbai");
		city.add("alibag");

		
		Set<Set<String>> set=new HashSet<>();
		set.add(city);
		//using Iterator through
		Iterator<Set<String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Set<String> s=itr.next();
			Iterator<String> itr2=s.iterator();
			while(itr2.hasNext())
			{
				String name=itr2.next();
				System.out.println(name);
			}
		}
		
		System.out.println("**************");
		//using for loop through
		for(Set<String> s1:set)
		{
			for(String name:s1)
			{
				System.out.println(name);
			}
		}
		
		System.out.println("**************");
		//using forEach through
		set.forEach((x)->{
			Set<String> s=x;
			s.forEach((name)->{
				System.out.println(name);
			});
		});
		
		

				
	}
}
