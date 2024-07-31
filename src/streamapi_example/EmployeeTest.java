package streamapi_example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
				list.add(new Employee(1,"Aaa",2000.01));
				list.add(new Employee(2,"Bbb",7000.01));
				list.add(new Employee(3,"Ccc",8000.01));
				list.add(new Employee(4,"Ddd",1000.01));
				list.add(new Employee(5,"Eee",6000.01));
			
				// Sort Salary Decending Order
			List<Employee> sorytedEmp2=	list.stream().sorted((o1,o2)->(int)(o2.getSallary()-o1.getSallary())).collect(Collectors.toList());
			System.out.println(sorytedEmp2);
				
				// Highest salary 
			Employee sorytedEmp=	 list.stream().sorted((o1,o2)->(int)(o2.getSallary()-o1.getSallary())).findFirst().get();
			System.out.println(sorytedEmp);
		
			// Second Highest salary
			Employee sorytedEmp1=	 list.stream().sorted((o1,o2)->(int)(o2.getSallary()-o1.getSallary())).skip(1).findFirst().get();
			System.out.println(sorytedEmp1);
			
			System.out.println("***************");
			
			
			
	}
}