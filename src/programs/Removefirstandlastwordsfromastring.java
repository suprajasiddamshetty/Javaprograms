package programs;

public class Removefirstandlastwordsfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday tuesday";
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		if(i==0 || i==s1.length-1)
		{
			s1[i]="";
		}
		System.out.print(s1[i]+" ");
	}

	}

}
