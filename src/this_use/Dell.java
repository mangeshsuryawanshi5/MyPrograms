package this_use;

public class Dell extends Laptop{

	int a=10;// global variable of sub class
	
	public static void main(String[] args) {
		
		Dell d= new Dell();
		d.display();

	}

	public void display()
	{
		int a=1;// local value of a
		
		int sum=10+a;// using local value of a
		System.out.println("Sum using local vlaue of a is "+sum);
		
		int sum1=10+this.a;//using global value of from same class
		System.out.println("Sum using global value from same class is "+sum1);
		
		int sum2=10+super.a;// using global value from super class
		System.out.println("Sum using global value from super class is "+sum2);
		
		
	}
}