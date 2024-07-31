package Collection_Comparator;

import java.util.Comparator;

public class Area implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return (int) (o1.getArea()-o2.getArea());
	}

}
