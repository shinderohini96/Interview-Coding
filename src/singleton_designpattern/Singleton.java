package singleton_designpattern;

public class Singleton {

	private static Singleton demo=null;
	
	public Singleton()
	{
		
	}
	
	public static Singleton getInstence()
	{
		if(demo==null)
		{
			demo=new Singleton();
		}
		
		return demo;
	}
}
