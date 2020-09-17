package may10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 extends class111 {
	p2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void m1()
	{
		System.out.print("m1  method");
	}
	public void m2()
	{
		System.out.print("m2  method");
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	class111 j=new p2(10);
	j.m1();
	j.a=10;
	System.out.print(j.a);
	
		
	}




}
