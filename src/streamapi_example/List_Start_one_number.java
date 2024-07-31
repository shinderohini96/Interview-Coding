package streamapi_example;

import java.util.Arrays;
import java.util.List;

public class List_Start_one_number {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(10,12,50,30,18,19);
		number.stream().map(s->s + "").filter(s->s.startsWith("1")).forEach(System.out::println);
	}
}

