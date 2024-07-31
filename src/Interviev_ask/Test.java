package Interviev_ask;


public class Test {
	
	Test(int a,int b)
	{
		System.out.println("a= "+a+", b= "+b);
	}
	
	Test(int a,Float b)
	{
		System.out.println("a= "+a+", b= "+b);
	}
	
public static void main(String[] args) {

	byte a=10;
	byte b=20;
	Test s=new Test(a,b);
}

}
