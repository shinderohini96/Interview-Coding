package this_exmple;

public class Student {

	public Student()
	{
		
		System.out.println("constructor");
	}
	
	public Student(int rollno)
	{
		this(1,"abc");
		System.out.println("constructor - int");
	}
	
	public Student(int rollno,String name)
	{
		this();
		System.out.println("constructor - int & String");
	}
}
