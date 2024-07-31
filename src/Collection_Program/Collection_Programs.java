package Collection_Program;
import java.util.ArrayList;
import java.util.Collections;

public class Collection_Programs {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(9);
		alist.add(7);
		alist.add(1);
		alist.add(3);
		
		System.out.println(alist); // [9, 7, 1, 3]
		
		//Assending Order
		Collections.sort(alist);
		System.out.println(alist);
		
		//Descending Order
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println(alist);
		
		//Min
		int min=Collections.min(alist);
		System.out.println(min);
		
		//Max
		int max=Collections.max(alist);
		System.out.println(max);
	}

}
