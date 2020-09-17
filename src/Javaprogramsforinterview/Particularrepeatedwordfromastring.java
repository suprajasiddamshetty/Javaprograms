package Javaprogramsforinterview;

public class Particularrepeatedwordfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday Today is monday";
		String ch[]=s.split("");
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
			if(count==1 || count==4)
			{
				ch[i]="";
			}
			System.out.print(ch[i]);
		}
		

	}

}
