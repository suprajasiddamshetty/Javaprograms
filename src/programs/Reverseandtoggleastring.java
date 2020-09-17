package programs;

public class Reverseandtoggleastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i].substring(0,1).toLowerCase()+s2[i].substring(1).toUpperCase()+" ");
		}

	}

}
