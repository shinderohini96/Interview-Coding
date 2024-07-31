package Collection_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Rohini");
		e1.setSalary(5000);
		
		Employee e2=new Employee();
		e2.setId(10);
		e2.setName("XYZ");
		e2.setSalary(1000);
		
		Employee e3=new Employee();
		e3.setId(20);
		e3.setName("Axya");
		e3.setSalary(3000);
		
		Set<Employee> set=new TreeSet<>();
		set.add(e3);
		set.add(e2);
		set.add(e1);
		
		
		for(Employee ee:set)
		{
			System.out.println(ee.getId());
			System.out.println(ee.getName());
			System.out.println(ee.getSalary());
		}
	}
}
