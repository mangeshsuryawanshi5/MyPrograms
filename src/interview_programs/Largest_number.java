package interview_programs;

public class Largest_number {

	public static void main(String[] args) {
		
		int[]a= {4,3,5,2,1,6};
		int max=a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if(max<a[i]);
			{
				max=a[i];
			}
		}
    System.out.println("Largest number is "+max);
	}

}
