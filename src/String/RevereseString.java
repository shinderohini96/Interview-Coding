package String;

public class RevereseString {

	public static void main(String[] args) {
		
		String s="hello";
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	
	}
}
