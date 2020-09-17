package programs;

public class Checkonestringisrotationofanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s1="prajasu";
		String s2=s+s;
		if(s2.contains(s1))
		{
			System.out.print("Two strings are rotation of each other");
		}
		else
		{
			System.out.print("Not a rotation");
		}

	}

}
