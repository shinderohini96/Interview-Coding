package Exception;

public class Test1 {

	public static void main(String[] args) {
		try
		{
		String s=args[0];
		int a=Integer.parseInt(s);
		int b=100/a;
		System.out.println(a);
		
	
		}
		catch (ArithmeticException e) {
		System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	
	}
}
