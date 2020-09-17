package programs;

import java.util.HashMap;

public class Longestsubstringfromagivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suprajasiddamshetty";
		int length=0;
		String substring="";
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), i);
			}
			else
			{
				
				i=h.get(s.charAt(i));
				h.clear();
			}
			
			if(h.size()>length)
			{
				length=h.size();
				substring=h.keySet().toString();
			}
		}
		System.out.println(substring);

	}

}
