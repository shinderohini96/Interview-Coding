package String;

public class StringCount_withoutSpace {

public static void main(String[] args) {
		
		String s="The Kiran Academy";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
