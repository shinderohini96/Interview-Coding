package Interviev_ask;

public class ReplaceLastOccurrence {

	public static void main(String[] args) {

		/*
		 String s="rohini";   ( last i replace a )
			output : rohina  
		 */
		String s = "rohini";
        char oldChar = 'i';
        char newChar = 'a';
        
        // Find the last occurrence of oldChar
        int lastIndex = s.lastIndexOf(oldChar);
        
        // If the character is found, replace it
        if (lastIndex != -1) {
            s = s.substring(0, lastIndex) + newChar + s.substring(lastIndex + 1);
        }
        
        // Print the result
        System.out.println(s);

	}

}
