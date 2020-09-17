package DataReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Propertydata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//Primitive to string
		
		int i=100;
		String s=String.valueOf(i);
		System.out.println(s);
	
		//String to primitive
		
		String s1="100";
		int i1=Integer.parseInt(s1);
		System.out.println(i1);
		
		//primitive to wrapper
		
		int i2=1000;
		Integer i3=Integer.valueOf(i2);
		System.out.println(i2);
		
		//wrapper to primitive
		Integer i4=new Integer(10000);
		int i5=i4.intValue();
		System.out.println(i5);
		
		//String to wrapper
		String s2="10000";
		Integer i6=Integer.valueOf(s2);
		System.out.println(i6);
		
		//wrapper to string
		
		Integer i8=new Integer(10000000);
		String s3=i8.toString();
		System.out.println(i8);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		
		
	
	

	}

}
