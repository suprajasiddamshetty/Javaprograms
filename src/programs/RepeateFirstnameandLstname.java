package programs;

import java.util.ArrayList;

import Collectionprograms.Employeeclass;



public class RepeateFirstnameandLstname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employeeclass>a=new ArrayList<Employeeclass>();
		a.add(new Employeeclass("1","s1"));
		a.add(new Employeeclass("2","s2"));
		a.add(new Employeeclass("3","s3"));
		a.add(new Employeeclass("4","s4"));
		a.add(new Employeeclass("2","s2"));
		a.add(new Employeeclass("1","s1"));
		a.add(new Employeeclass("2","s2"));
		a.add(new Employeeclass("3","s8"));
		a.add(new Employeeclass("5","s1"));
		a.add(new Employeeclass("3","s3"));
		a.add(new Employeeclass("2","s2"));
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i).firstname)!="")
			{
				int count=1;
				for(int j=i+1;j<a.size();j++)
				{
					if(a.get(i).firstname==a.get(j).firstname)
					{
						
					if(a.get(i).lastname==a.get(j).lastname)
					{
					count++;
					a.get(j).firstname="";
				}}}
				System.out.println(a.get(i).firstname+" "+a.get(i).lastname+" "+count+"times");
			}
		}
	}
		
	
	}


