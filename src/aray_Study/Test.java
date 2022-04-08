package aray_Study;

public class Test {

	public static void main(String[] args) {
		
//		String name1="Velocity";
//		String name2="Ctroporate";
//		String name3="Training";
//		String name4="Center";
//		
//		int Salary=50000;
//		
		//1. declaration
		
		String institute[]= new String[5];
		
		//2.initialization
		institute[0]="Velocity";
		institute[1]="Corporate";
		institute[2]="Training";
		institute[3]="Center";
		
		
		//3.usages
		
		System.out.println(institute[0]);
		System.out.println(institute[1]);
		System.out.println(institute[2]);
		System.out.println(institute[3]);
		
		
		System.out.println("==================");
		for(int i=0;i<=3;i++)
		{
			System.out.println(institute[i]);
		}
		
		
	}
	
	
	

}