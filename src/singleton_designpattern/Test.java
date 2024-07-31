package singleton_designpattern;

public class Test {

	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstence();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Singleton s2=Singleton.getInstence();
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}
}
