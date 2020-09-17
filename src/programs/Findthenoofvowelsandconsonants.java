package programs;

public class Findthenoofvowelsandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		char ch[]=s.toCharArray();
		int vowels=0;
		int consonants=0;
		for(char ch1:ch)
		{
			if(ch1 == 'a' ||ch1== 'e' || ch1=='i' || ch1=='o' || ch1=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.print(vowels+" "+consonants);
	}

}
