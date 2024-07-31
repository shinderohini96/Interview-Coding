package streamapi_example;

import java.util.Arrays;
import java.util.List;

public class Sum_squares {

	public static void main(String[] args) {
		
		/*
		 Find sum of squares from list using java 8. 
		Input : 1,2,3,4,5
		Output : Sum of squares: 55
		 */
		
		List<Integer> number=Arrays.asList(1,2,3,4,5);
	int sumOfSquares=	number.stream().mapToInt(n->n*n).sum();
		System.out.println("Sum of Squares: "+sumOfSquares);
	}
}
