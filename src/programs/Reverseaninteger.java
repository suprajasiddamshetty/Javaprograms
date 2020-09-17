package programs;

public class Reverseaninteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=456810231;
		int result=0;
		while(i>0)
		{
			int temp=i%10;
			result=result*10+temp;
			i=i/10;
		}
		System.out.print(result);
		

	}

}
