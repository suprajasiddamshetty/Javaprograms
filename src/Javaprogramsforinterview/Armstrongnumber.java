package Javaprogramsforinterview;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={123,400,78910};
		
		for(int i=0;i<n.length;i++)
		{
			int rem;
			int res=0;
			while(n[i]!=0)
			{
				rem=n[i]%10;
				res=res+(rem*rem*rem);
				n[i]=n[i]/10;
				
				
				
				
			}
			System.out.println(res);
		}
		
		

	}}
