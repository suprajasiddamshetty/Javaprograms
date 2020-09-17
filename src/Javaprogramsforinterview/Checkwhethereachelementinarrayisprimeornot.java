package Javaprogramsforinterview;

public class Checkwhethereachelementinarrayisprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]={3,6,1,2,5,11,13,19,21,111,17};
//		for(int i=0;i<a.length;i++)
//		{
//			int res=0;
//			int temp=a[i];
//			while(a[i]>0)
//			{
//				int rem=a[i]%10;
//				res=(res*10)+rem;
//				a[i]=a[i]/10;
//			}
//			if(temp==res)
//			{
//				System.out.print(temp+" ");
//			}
//			
//		}
//		
		int a1[]={3,6,1,2,5,11,13,19,21,111,17};
		for(int i=0;i<a1.length;i++)
		{
			int temp1=a1[i];
			int count=0;
			for(int j=2;j<a1[i];j++)
			{
				if(temp1%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(a1[i]);
			}
		}

	}

}
