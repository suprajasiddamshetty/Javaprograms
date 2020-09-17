package Javaprogramsforinterview;

public class Removespacesinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" supraja siddamshetty sriiii";
		String s1[]=s.split("");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(" "))
			{
				s1[i]="";
			}
			System.out.print(s1[i]);
		}

	}

}
