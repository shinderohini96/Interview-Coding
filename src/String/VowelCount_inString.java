package String;

public final class VowelCount_inString {

	public static void main(String[] args) {
		
		String str="abhishek";
		
		 str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			//check if char[i] is vowel
			if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='e' ||
					str.charAt(i)=='i' || str.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("Total number of Vowels in String :  "+count);
	}
}

/*
//OUTPUT
 
Total number of Vowels in String :  3

*/