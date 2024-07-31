package streamapi_example;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Join_ElementListusing_comma {

	public static void main(String[] args) {
		
		/*
		 Join element of list using ',' using java 8.
		 Input: "apple","banana","cherry","date","grape"
		 Output: apple, banana, cherry, date, grape
		 */
		
		//using Stream Api
		List<String> words=Arrays.asList("apple","banana","cherry","date","grape");
		System.out.println(words);
	String joinstring=	words.stream().collect(Collectors.joining(", "));
		System.out.println(joinstring);
		
	//using StringJoiner
		StringJoiner sj=new StringJoiner(", ");
		sj.add("apple").add("banana").add("cherry").add("date").add("grape");
		
		System.out.println(sj);
	}
}
