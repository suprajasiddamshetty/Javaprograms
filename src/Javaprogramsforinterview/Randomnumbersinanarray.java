package Javaprogramsforinterview;

import java.util.Random;

public class Randomnumbersinanarray {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int low =10;
		int high=20;
		for(int i=0;i<=20;i++)
		{
			int n=r.nextInt(high-low)+low;
			System.out.println(n);
			
		}
	}
}

	


