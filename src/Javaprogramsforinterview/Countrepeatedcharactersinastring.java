package Javaprogramsforinterview;

public class Countrepeatedcharactersinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja siddamshetty";
		String ch[]=s.split("");
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(ch[i]!="")
			{
				for(int j=i+1;j<ch.length;j++)
					{ 
					  if(ch[i].equals(ch[j]))
					  {
						  count++;
						  ch[j]="";
					  }
						}
				
			}
			if(count>1)
			{
				System.out.println(ch[i]+" "+count+"times");
			}
				
		}

	}

}
