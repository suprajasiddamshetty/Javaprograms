package Javaprogramsforinterview;

public class RemoveduplicateWordsfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday Today is tuesday Today monday is";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!="")
			{
			int count=1;
			
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="";
					
				}
			}
			System.out.print(s1[i]+" ");
			}
		}

	}

}
