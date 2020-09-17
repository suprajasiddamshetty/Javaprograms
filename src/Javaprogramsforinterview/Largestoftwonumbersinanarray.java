package Javaprogramsforinterview;

public class Largestoftwonumbersinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,6,1,9,8,3,10,12};
	int temp;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(a[0]+" "+a[1]);
        
	}

}
