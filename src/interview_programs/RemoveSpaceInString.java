package interview_programs;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		
		String s="The sun is the brghetest star";
		
		String ns=s.replaceAll("\\s", "");
		
		System.out.println(ns);
	}

}
