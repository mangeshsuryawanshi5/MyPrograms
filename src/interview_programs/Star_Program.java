package interview_programs;

public class Star_Program {

	public static void main(String[] args) {
		
		
		System.out.println("======Ascending========");
		
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
		
		System.out.println();

	}
System.out.println("======Descending========");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
		
		System.out.println();
	}
}

}