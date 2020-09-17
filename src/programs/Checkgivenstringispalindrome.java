package programs;

public class Checkgivenstringispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin ini nitin";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		//s1=s1+" ";
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("palindrome");
		}

	}

}
