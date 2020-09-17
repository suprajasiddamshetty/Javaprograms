package Javaprogramsforinterview;

public class CheckOnestringisrotationofanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s1="rpajasu";
		String s2=s+s;
		if(s2.contains(s1))
		{
			System.out.print("Two strings are rotation of each other");
		}
		else
		{
			System.out.print("Not a rotation of each other");
		}
		
		
		

	}

}
