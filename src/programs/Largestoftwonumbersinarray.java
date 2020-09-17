package programs;

public class Largestoftwonumbersinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,6,1,9,8,3,10,12};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++ )
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}}
			
				System.out.println(a[0]+" "+a[1]);
			
		}

	}


