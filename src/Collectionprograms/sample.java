package Collectionprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import jxl.write.Number;
public class sample {
		// TODO Auto-generated method stub
	
	  public static void main(String[] args) throws BiffException, IOException, WriteException 
	    { 
try
{
            File f=new File("C:\\New folder\\text.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            File f1=new File("C:\\New folder\\text1.txt");
            FileWriter fw=new FileWriter(f1);
            BufferedWriter bw=new BufferedWriter(fw);
  String l;
  while((l=br.readLine())!=null)
       {
           	String p[]=l.split(" ");
           	int x=Integer.parseInt(p[0]);
        	int y=Integer.parseInt(p[1]);
       	int z=x+y;
          	bw.write(z);
       } }      
  

            

catch(Exception e)
{
	System.out.println("File not found");
}

finally
{
	
}
           
            
            
         }
		}

		
				
		
		
       



	

