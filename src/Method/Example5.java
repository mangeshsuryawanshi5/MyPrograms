package Method;

public class Example5 {

	public void addidtion()
	{
	int a=7;
	int b=18;
	int sum=a+b;
	
	System.out.println("The addition is "+sum);
	}
	
	public void subtraction()
	
	{
		int a=15;
		int b=12;
		int sub=a-b;
		
		System.out.println("The subtraction is "+sub);
	}
	public static void main(String[] args) {
		// Addition program for non static method
Example5 Math=new Example5();// creating object
Math.addidtion(); // Calling non static addition method name
Math.subtraction(); // Calling non static subtraction method name
Math.additon1(5, 8);
Math.additon1(40, 40);
	}

	public void additon1(int value, int value2)
	{
		int a=value;
		int b=value2;
	 int sum=a+b;
		
		System.out.println("The addition is "+sum);
	}
}
