package interview_programs;

public class Armstrong {

	public static void main(String[] args) {
		
		int number=455;
		int replica=number;
		int arm=0;
		
		while(replica!=0)
		{
			int reminder=replica%10;
			int multi=1;
			
			for(int i=1;i<=3;i++)
			{
				multi=multi*reminder;
			}
			
			arm=arm+multi;
			replica=replica/10;
			
		}
		System.out.println("The reverse of number is "+arm);
		if(arm==number) {
			System.out.println("The no is armstrong");
		}
		else {
			System.out.println("The no is not armstrong");
		}
		
	}

}
