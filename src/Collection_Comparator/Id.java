package Collection_Comparator;

import java.util.Comparator;

public class Id implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		
		return o1.getId()-o2.getId();
	}

}
