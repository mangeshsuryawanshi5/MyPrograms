package interview_programs;

public class VowelsinString {

	public static void main(String[] args) {
		String s="welcome";
		char [] letters=s.toCharArray();
		int count=0;
		
		for(char c: letters)
		{
			switch(c)
			{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				
				count++;
				break;
				default:
				
			}
		}
		System.out.println("Total vowels in string = "+count);

	}

}
