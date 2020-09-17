package Javaprogramsforinterview;

public class Powerofagivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=4;
		int exponent=3;
		int res=1;
		for(int i=0;i<exponent;i++)
		{
			res=res*base;
		}
		System.out.print(res);
	}

}
