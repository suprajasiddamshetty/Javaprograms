package Javaprogramsforinterview;

public class GivenStringispalindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin iji nitin";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
			System.out.print("Given String Is Palindrome");
		}
		else
		{
			System.out.print("Given String Is Not A Palindrome");
		}
		

	}

}
