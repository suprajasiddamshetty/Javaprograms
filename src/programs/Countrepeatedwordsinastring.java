package programs;

public class Countrepeatedwordsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is supraja This is my world my supraja";
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
			if(count>1)
			{
			System.out.println(s1[i]+count+"times");
			}
		}
		}

	}

}
