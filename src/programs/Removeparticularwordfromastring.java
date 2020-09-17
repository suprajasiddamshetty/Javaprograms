package programs;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

public class Removeparticularwordfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is my country";
		String ch[]=s.split("");
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
			if(count==1)
			{
			     ch[i]="";
			     
			}
			System.out.print(ch[i]);
		}
		
	
	}

}
