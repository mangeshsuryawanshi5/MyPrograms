package interview_programs;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
		
		String s="Aurangabad";
		char c[]=s.toCharArray();
		int count=0;
		
		for(char ch:c)
		{
			if(ch=='a')
			{
				count++;
			}
		}
		System.out.println("Given character occurs = "+count);
		
	}

}
