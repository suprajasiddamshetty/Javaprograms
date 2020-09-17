package Javaprogramsforinterview;

public class Capitaliseandreverseagivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is supraja";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		String s2[]=s1.split(" ");
		for(int  i=0;i<s2.length;i++)
		{
			System.out.print(s2[i].substring(0,1).toUpperCase()+s2[i].substring(1).toLowerCase()+" ");
		}
		

	}

}
