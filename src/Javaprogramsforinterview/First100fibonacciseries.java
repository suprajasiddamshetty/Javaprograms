package Javaprogramsforinterview;

public class First100fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=a+b;
		for(int i=1;i<=100;i++)
		{
			System.out.println(a+" ");
			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
