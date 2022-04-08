import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		char [] s= {'A','C','B','G','D'};
		
		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
