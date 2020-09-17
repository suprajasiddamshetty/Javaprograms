package Javaprogramsforinterview;

import java.util.HashMap;

public class LongestSubstringfromagivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suprajasiddamshetty";
		String substring="";
		int size=0;
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!(h.containsKey(s.charAt(i))))
			{
				h.put(s.charAt(i), i);
			}
			else
			{
				i=h.get(s.charAt(i));
				h.clear();
				
			}
			if(h.size()>size)
			{
				size=h.size();
				substring=h.keySet().toString();
			}
		}
		System.out.print(substring);

	}

}
