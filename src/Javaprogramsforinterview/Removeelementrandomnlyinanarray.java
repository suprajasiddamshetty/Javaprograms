package Javaprogramsforinterview;

import java.util.Scanner;

public class Removeelementrandomnlyinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=a.length;
		for(int i=0;i<n1-1;i++)
		{
			if(i==n || i>n)
			{
				a[i]=a[i+1];
				
			}
		}
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}

	}

}
