package interview_programs;

public class Prime_number {
	public static void main(String[] args) {
	
	int no=9;
	int temp=0;
	
	for(int i=2;i<=no-1;i++)
	{
		if(no%i==0)
		{
			temp=temp+1;
		}
	}
	if (temp>0)
	{
		System.out.println("number is not prime number");
	}
	else
	{
		System.out.println(no+" number is prime number");
	}
}
}
	
