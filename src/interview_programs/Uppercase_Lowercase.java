package interview_programs;

public class Uppercase_Lowercase {
	
	public static void main(String[] args) {
//		String s="I Love My India";
//		String Upper="";
//		String Lower="";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch>=65 && ch<=90)
//			{
//				Upper=ch+Upper;
//			}
//			else {
//				Lower=ch+Lower;
//			}
//		}
//		
//		System.out.println("The Upper case Charecters are ="+Upper);
//		System.out.println("The lower case characters are ="+Lower);
		
		String s="I Love My India";
		int Upper=0;
		int Lower=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper++;
			}
			else {
				Lower++;
			}
		}
		
		System.out.println("The Upper case Charecters are ="+Upper);
		System.out.println("The lower case characters are ="+Lower);
	}

}
