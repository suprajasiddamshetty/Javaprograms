package Javaprogramsforinterview;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
		int n1=4;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=(n1-i);j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
