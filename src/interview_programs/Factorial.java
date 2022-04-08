package interview_programs;

public class Factorial {

	public static void main(String[] args) {
		
		int n=6;
		int fact=1, i;
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("The factorial of 6 is "+fact);

	}

}
