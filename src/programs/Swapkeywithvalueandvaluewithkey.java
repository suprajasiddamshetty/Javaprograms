package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Swapkeywithvalueandvaluewithkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer>a=new HashMap<Character,Integer>();
		a.put('c', 1);
		a.put('a', 2);
		a.put('b', 3);
		a.put('d', 4);
		a.put('e', 5);
		a.put('f', 6);
		HashMap<Integer,Character>a1=new HashMap<Integer,Character>();
		Set<Entry<Character,Integer>>a2=a.entrySet();
		Iterator<Entry<Character,Integer>>a3=a2.iterator();
		while(a3.hasNext())
		{
			Entry<Character,Integer>a4=a3.next();
			a1.put(a4.getValue(),a4.getKey());
			
		}
		a.clear();
		
		
		
		
		}

}
