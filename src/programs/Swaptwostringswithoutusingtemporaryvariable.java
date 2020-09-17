package programs;

public class Swaptwostringswithoutusingtemporaryvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s1="soujanya";
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.print(s+" "+s1);

	}

}
