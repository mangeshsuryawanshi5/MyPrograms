package interview_programs;

public class Palandrome {

	public static void main(String[] args) {
		
		int n=121;
		int temp=n;
		int rev=0;
		
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		
		System.out.print(rev);
		
		if(n==rev) {
			System.out.println(" is palandrome number");
		}
		else
		{
			System.out.println(" is not palandrome number");
		}
	}

}
