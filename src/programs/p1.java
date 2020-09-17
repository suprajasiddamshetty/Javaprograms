package programs;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import Collectionpackage.Employee;

class p1 {
public static void main(String[] args)    {
	{
		int n[]={123,45,6789};
		for(int i=0;i<n.length;i++)
			{
			int res=0;
			while(n[i]!=0)
			{
				int temp=n[i]%10;
				res=res+(temp*temp*temp);
				n[i]=n[i]/10;
			}
			System.out.println(res);
		}
		
	}
		
	
	
	
		
		
		

























}
}