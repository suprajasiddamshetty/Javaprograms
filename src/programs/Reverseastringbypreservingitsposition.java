  package programs;

public class Reverseastringbypreservingitsposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is supraja";
		char s1[]=s.toCharArray();
		char s2[]=new char[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==' ')
			{
				s2[i]=' ';
			}
		}
		int j=s.length()-1;
		for(int i=0;i<s1.length;i++)
		{
		     if(s1[i]!=' ')
		     {
		    	 if(s2[j]==' ')
		    	 {
		    		 j--;
		    	 }
		     
		    	 s2[j]=s1[i];
		    	 j--;
		     }
		    
		}
		 System.out.print(s.valueOf(s2));

	}

}
