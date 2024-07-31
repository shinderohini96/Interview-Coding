package Collection_Comparable;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		
		//return this.id-o.id;
		//return name.compareTo(o.name);
		return (int) (this.salary-o.salary);
	}
	
	
}
