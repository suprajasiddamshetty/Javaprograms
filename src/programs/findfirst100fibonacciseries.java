package programs;

public class findfirst100fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=a+b;
		for(int i=0;i<10;i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
