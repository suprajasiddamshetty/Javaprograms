package programs;

import java.util.HashMap;

public class Checktwostringsareanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s2="supraja";
		//Method 1
		if(s.length()!=s2.length())
		{
			System.out.println("laengths are not equal");
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s.charAt(i)==(s2.charAt(j)))
					{
						s2=s2.substring(0,j)+s2.substring(j+1);
						break;
					}
				}
			}
		}
		System.out.println(s2);
		if(s2.length()==0)
		{
			System.out.println("Two strings are anagrams");
		}
		//Method2
		
		String s1="supraja";
		String s21="supraja";
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			if(h.containsKey(s1.charAt(i)))
			{
				h.put(s1.charAt(i), h.get(s1.charAt(i))+1);
			}
			else
			{
				h.put(s1.charAt(i), 1);
			}
		}
		for(int j=0;j<s21.length();j++)
		{
			if(h.containsKey(s21.charAt(j)))
			{
				if(h.get(s21.charAt(j))==1)
				{
					h.remove(s21.charAt(j));
				}
				else
				{
					h.put(s21.charAt(j), h.get(s21.charAt(j))-1);
				}
			}
			else
			{
				h.put(s21.charAt(j), 1);
			}
		}
		System.out.println(h.size());
		if(h.size()==0)
		{
			System.out.println(h.size());
			System.out.println("Anagrams");
		}

	}

}
