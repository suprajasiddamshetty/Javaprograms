package Javaprogramsforinterview;

public class Removeduplicatecharactersfromasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday";
		String s1[]=s.split("");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(" "))
			{
				s1[i]=" ";
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(s1[i]!="" && s1[i]!=" ")
			{
			for(int j=i+1;j<s.length();j++)
			{
				if(s1[i].equals(s1[j]))
				{
					s1[j]="";
				}
			}
			}
			System.out.print(s1[i]);
		}

	}

}
