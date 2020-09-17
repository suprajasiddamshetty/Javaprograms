package programs;

public class Returnlistofuniquestringsfromanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday Today is tuesday";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			if(s1[i]!=" ")
			{
			for(int j=i+1;j<s1.length;j++)
			{
			if(s1[i].equals(s1[j]))
			{
				count++;
				s1[j]="";
			}
		}
			}
			if(count==0)
			{
				
				System.out.print(s1[i]+" ");
			}

	}
	}
}
