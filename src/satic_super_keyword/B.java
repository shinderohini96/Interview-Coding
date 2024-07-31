package satic_super_keyword;

public class B extends A{

	public void m1()
	{
		super.m1();
		System.out.println("m1_B");
	}
	

	public void m3(int x)
	{
		System.out.println("m3_B");
	}
}
