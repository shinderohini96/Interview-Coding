package Collection_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<College> set=null;
		College c1=new College();
		c1.setId(103);
		c1.setName("Aya");
		c1.setArea(100);
		c1.setAddr("pune");
		
		College c2=new College();
		c2.setId(10);
		c2.setName("Fsdxya");
		c2.setArea(10);
		c2.setAddr("karve");
		
		set=new TreeSet<>(new Name());
		
		set.add(c1);
		set.add(c2);
		
		for(College c:set)
		{
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getArea());
			System.out.println(c.getAddr());
		}
		
	}
}
