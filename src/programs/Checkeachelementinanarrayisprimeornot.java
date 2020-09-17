package programs;

public class Checkeachelementinanarrayisprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,6,1,2,5,11,13,19,21,111,17};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
		  for(int j=2;j<a[i];j++)
		  {
			  if(a[i]%j==0)
			  {
				  count++;
			  }
		  }
		  if(count==0)
		  {
			  System.out.println(a[i]);
		  }
		}

	}

}
