package interview_programs;

public class ReverseStringWithoutRemovingSpecialChar {

	public static void main(String[] args) {
		
		String s="ab!!@&%!xyz";
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
		    rev=s.charAt(i)+rev;	
		}
		
		System.out.println(rev);
		
		StringBuffer s1=new StringBuffer("ab!!@&%!xyz");
		System.out.println(s1.reverse());

	}

}
