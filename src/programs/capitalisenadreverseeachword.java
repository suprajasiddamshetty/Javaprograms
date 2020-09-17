package programs;

public class capitalisenadreverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is supraja";
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				s2=s2+s1[i].charAt(j);
			}
			s2=s2+" ";
		}
		String s3[]=s2.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(s3[i].substring(0,1).toUpperCase()+s3[i].substring(1).toLowerCase()+" ");
		}
		

	}

}
