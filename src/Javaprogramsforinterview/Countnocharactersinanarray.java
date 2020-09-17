package Javaprogramsforinterview;

public class Countnocharactersinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]={'s','u','p','r','a','j','a','a'};
		int n=ch.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=ch[ch.length-1];
					n--;
					j--;
					
				}
			}
			System.out.println(ch[i]+" "+count+"times");
		}

	}

}
