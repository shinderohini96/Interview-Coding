package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetListSet {

	public static void main(String[] args) {
		
		
		Set<Integer> set=new HashSet<>();
		set.add(11);
		set.add(50);
		set.add(87);
		
		List<Set<Integer>> list=new ArrayList<>();
		list.add(set);
		
		Set<List<Set<Integer>>> set1=new HashSet<>();
		set1.add(list);
		
		//using Iterator through
	Iterator<List<Set<Integer>>> itr=	set1.iterator();
	while(itr.hasNext())
	{
		List<Set<Integer>> lsi=itr.next();
		Iterator<Set<Integer> > itr2=lsi.iterator();
		while(itr2.hasNext())
		{
			Set<Integer> si=itr2.next();
			Iterator<Integer> itr3= si.iterator();
			while(itr3.hasNext())
			{
			int x=	itr3.next();
			System.out.println(x);
			}
		}
	}
	
	System.out.println("****************");
	//using for loop through
	for(List<Set<Integer>> lsi:set1)
	{
		for(Set<Integer> si:lsi)
		{
			for(int x:si)
			{
				System.out.println(x);
			}
		}
	}
	
	
		System.out.println("****************");
		//using forEach(Lambda Expression) trough
		set1.forEach((sls)->{
			List<Set<Integer>>  lis=sls;
			lis.forEach((se)->{
				Set<Integer> set3=se;
				set3.forEach((x)->{
					System.out.println(x);
				});
			});
		});
	}
}
