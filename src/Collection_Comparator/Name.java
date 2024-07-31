package Collection_Comparator;

import java.util.Comparator;

public class Name implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
