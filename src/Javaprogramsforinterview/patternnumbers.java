package Javaprogramsforinterview;

public class patternnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int temp=n;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println(" ");
		}
		System.out.println("***********************************************");
		int n1=4;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		System.out.println("***********************************************");
		int n2=4;
		int temp=1;
		for(int i=1;i<=n2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println(" ");
		}
		System.out.println("***********************************************");
		
		int n3=5;
		
		for(int i=1;i<=n3;i++)
		{
			if(i%2==0)
			{
				int temp2=0;
			for(int j=1;j<=n3;j++)
			{
				
					System.out.print(temp2+" ");
					temp2=(temp2==0)?1:0;
				}
			
			}
			else
			{
				
				int temp3=1;
				for(int j=1;j<=n;j++)
				{
					
						System.out.print(temp3+" ");
						temp3=(temp3==0)?1:0;
					}
				
				}
			System.out.println(" ");
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


