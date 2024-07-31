package Collection_Program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<String> city=new HashSet<>();
		
		city.add("pune");
		city.add("mumbai");
		city.add("nashik");
		city.add("jalgaon");
		city.add("shirpur");

		//using Iterator through
		Iterator<String> itr=city.iterator();
		while(itr.hasNext())
		{
		String s=itr.next();	
			System.out.println(s);
		}
		
		System.out.println("**************");
		//using for loop through
		for(String s:city)
		{
			System.out.println(s);
		}
			
		System.out.println("**************");
		//using forEach(Lambda Expression) trough
		city.forEach((x)->{
			System.out.println(x);
		});
	}
}
