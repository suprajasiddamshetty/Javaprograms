package Javaprogramsforinterview;

public class Reverseaninteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456868;
		int temp=n;
		int res=0;
		while(n!=0)
		{
			int rem=n%10;
			 res=(res*10)+rem;
			 n=n/10;
		}
		
		System.out.print(res);

	}

}
