package pattern_Programs;

public class DownSide_Triangle {

	public static void main(String[] args) {
		
//		*******
//		 *****
//		  ***
//		   *
		   
		int space=0;
		int star=7;
				
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
			
		}
			
	}

}
