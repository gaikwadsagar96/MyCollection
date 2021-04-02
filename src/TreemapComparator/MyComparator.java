package TreemapComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Car>
{

	@Override
	public int compare(Car c1, Car c2)
	{
		if(c1.price>c2.price)
			return 1;
		else if(c1.price<c2.price)
			return -1;
		else
			return 0;
	}
	
}
