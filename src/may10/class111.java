package may10;

import java.util.Comparator;

public  class class111 implements Comparator<Table>{

	@Override
	public int compare(Table t1, Table t2) {
		// TODO Auto-generated method stub
//		if(t1.id==t2.id)
//		{
//			return 0;
//		}
//		else if(t1.id>t2.id)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		return t1.id.compareTo(t2.id);
	}
	

}
