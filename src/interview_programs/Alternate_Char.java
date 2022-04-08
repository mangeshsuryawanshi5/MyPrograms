package interview_programs;

public class Alternate_Char {

	public static void main(String[] args) {
		
		String s="ABCDEFGH";
		for(int i=0; i<s.length();i=i+2)
		{
		System.out.println(s.charAt(i));
		}

	}

}
