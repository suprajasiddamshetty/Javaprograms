package programs;

public class Missingnumbersinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,4,5,8,9};
		int j=1;
		for(int i=0;i<a.length;i++)
		{
			if(j==a[i])
			{
				j++;
			}
			else
			{
				System.out.println(j);
				j++;
				i--;
			}
		}
		
	}

}
