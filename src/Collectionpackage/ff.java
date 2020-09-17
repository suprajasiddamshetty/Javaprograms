package Collectionpackage;

import java.util.Comparator;

public class ff implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e2.eid==e1.eid)
		{
			return 0;
		}
		else if(e2.eid<e1.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
