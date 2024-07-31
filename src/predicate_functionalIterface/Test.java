package predicate_functionalIterface;

import java.util.function.Predicate;

public class Test implements Predicate<Test>{



	@Override
	public boolean test(Test t) {
		
		return false;
	}
	
	public static void main(String[] args)
	{
	Predicate<Integer> lessthan=i->(i<18);
	System.out.println(lessthan.test(19));
		
	}
}
