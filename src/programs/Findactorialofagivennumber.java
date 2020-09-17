package programs;

import java.util.Scanner;

public class Findactorialofagivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res=n;
		for(int i=n-1;i>0;i--)
		{
			res=res*i;
		}
		System.out.print(res);
		
	}

}
