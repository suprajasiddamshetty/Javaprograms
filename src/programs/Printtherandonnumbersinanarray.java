package programs;

import java.util.Random;

public class Printtherandonnumbersinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int low=10;
		int high=20;
		for(int i=0;i<5;i++)
		{
			int result=r.nextInt(high-low)+low;
			System.out.print(result+" ");
		}
	}
	}


