package Javaprogramsforinterview;

public class Nonrepeatedcharacterfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suppprajasu";
		String s1[]=s.split("");
		for(int i=0;i<s.length();i++)
		{
			if(s1[i]!="")
			{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="";
					
				}
			}
			if(count==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
			}
		}
	}

}