package may10;

import java.io.Serializable;

public class Table implements Serializable,Comparable<Table>{
	
	 Integer id;
	transient String name;
	Table(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Table a) {
//		if(id==a.id)
//		{
//			return 0;
//		}
//		else if(id>a.id)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		return id.compareTo(a.id);
	}

	

}
