package programs;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=5;i++)
		{	int n=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n--;
			}
			System.out.println(" ");
		}
		
		System.out.println("*****************************");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("*****************************");
		
		for(int i=1;i<=4;i++)
		{
			
			if( (i%2)!=0)
			{
				int num=1;
			for(int j=1;j<=5;j++)
			{ System.out.print(num);
			  num=num==1?0:1;
			}
			}
				
				else
				{
					int num1=0;
					for(int j=1;j<=5;j++)
					{System.out.print(num1);
					num1=num1==0?1:0;
				}
			}
			System.out.println(" ");
				
				
			}
		
		System.out.println("*****************************");
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
				
			}
			System.out.println(" ");
		}
		}

	}


