package aray_Study;

public class MultiDimentionalArray2 {

	public static void main(String[] args) {
		
		int ar[][]= {{10,20},{30,40}};
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[1][0]=30;
		ar[1][1]=40;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=0;j<=ar.length-1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
