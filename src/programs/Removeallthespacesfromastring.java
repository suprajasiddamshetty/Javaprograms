package programs;

import java.util.Random;

public class Removeallthespacesfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja siddamshetty ss";
		String s1[]=s.split("");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				s1[i]="";
			}
			System.out.print(s1[i]);
		}
	}

}
