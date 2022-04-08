package interview_programs;

public class String_Letter_Count {

	public static void main(String[] args) {
		
		String name="MANGESH SURYAWANSHI"; //original string
		int a=name.length(); //Find out the length of original string
		
		String b=name.replace("A", "");
		int c=b.length();
		int count=a-c;
		
		System.out.println("Occurance of M in the string "+count);

	}

}
