package String;

public class reverseword_ofsentence {

	public static void main(String[] args) {
		
		
		//input: Java Coding is easy
		//output: easy is Coding Java
		
		String str="Java Coding is easy";
		
		String st[]=str.split(" ");
		String res="";
		
		for(int i=st.length-1;i>=0;i--)
		{
			res=res+st[i]+" ";
		}
		
		System.out.println(res);
	
	}
}
