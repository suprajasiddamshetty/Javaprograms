package programs;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
	    for (int i= 0; i<= 4 ; i++)
	    {
	        for (int j=0; j<=i; j++)
	        {
	            System.out.print(" ");
	        }
	        for (int k=0; k<=4-1-i; k++)
	        {
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	    System.out.print("******************************************************");
	    int n=5;
	    for(int i=0;i<=n;i++)
	    {
	    	for(int j=0;j<(n-i);j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=0;j<((2*i)-1);j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }
	}

}
