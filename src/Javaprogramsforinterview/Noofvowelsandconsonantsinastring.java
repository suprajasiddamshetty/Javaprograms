package Javaprogramsforinterview;

public class Noofvowelsandconsonantsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.print("vowels:"+" "+vowels+" "+"consonants"+" "+consonants);
	}

}
