package Javaprogramsforinterview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Swapkeywithvalueandvaluewithkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Character>a=new HashMap<Character,Character>();
		a.put('c', '1');
		a.put('a', '2');
		a.put('b', '3');
		a.put('d', '4');
		a.put('e', '5');
		a.put('f', '6');
		HashMap<Character,Character>a1=new HashMap<Character,Character>();
		Set<Entry<Character,Character>>a2=a.entrySet();
		for(Entry<Character,Character>a3:a2)
		{
			a1.put(a3.getValue(),a3.getKey());
		}
		a.clear();
		a.putAll(a1);
		
		Set<Entry<Character,Character>>a4=a.entrySet();
		for(Entry<Character,Character>a5:a4)
		{
			System.out.println(a5.getKey()+" "+a5.getValue());
		}
		
		
	}

}
