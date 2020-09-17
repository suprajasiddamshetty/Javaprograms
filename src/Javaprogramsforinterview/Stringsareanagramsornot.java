package Javaprogramsforinterview;

import java.util.HashMap;

public class Stringsareanagramsornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s1="supraja";
//		if(s.length()!=s1.length())
//		{
//			System.out.println("Two strings are not anagrams");
//		}
//		else
//		{
//			for(int i=0;i<s.length();i++)
//			{
//				for(int j=0;j<s1.length();j++)
//				{
//					if(s.charAt(i)==s1.charAt(j))
//					{
//						s1=s1.substring(0,j)+s1.substring(j+1);
//						break;
//					}
//				}
//			}
//		}
//		if(s1.length()==0)
//		{
//			System.out.print("Anagrams");
//		}
//		

	
	HashMap<Character,Integer>a=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(a.containsKey(s.charAt(i)))

			{
			      a.put(s.charAt(i), a.get(s.charAt(i))+1);
			}
		else
		{
			a.put(s.charAt(i), 1);
		}
	}
	for(int j=0;j<s1.length();j++)
	{
		if(a.containsKey(s1.charAt(j)))
		{
			if(a.get(s1.charAt(j))==1)
			{
				a.remove(s1.charAt(j));
			}
			else
			{
				a.put(s1.charAt(j), a.get(s1.charAt(j))-1);
			}
		}
		else
		{
			a.put(s.charAt(j), 1);
		}
	}

	if(a.size()==0)
	{
		System.out.print("Two strings are anagrams");
	}

}
}
