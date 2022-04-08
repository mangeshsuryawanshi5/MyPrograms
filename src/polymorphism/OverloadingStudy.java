package polymorphism;

public class OverloadingStudy {

	public static void main(String[] args) 
	{
		OverloadingStudy o= new OverloadingStudy();// created object of a class
		o.add();
		o.add(10,30);
		o.add(99.99f,88.88f);
		o.add(11.11f, 22.22f);

	}
	
	public void add()// method with zero parameters
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}

	public void add(int a, int b)// method with two integer parameters
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
		
	}
	
	public void add(float a, float b)// method with two float parameters
	{
		float sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	
}