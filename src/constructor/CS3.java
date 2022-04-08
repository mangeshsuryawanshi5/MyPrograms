package constructor;

public class CS3 {

	int a; // variable declaration
	int b;
	int c;
	
	public CS3()
	
	{
		a=10;
		b=20;
		c=30;
		
	}
	
	public CS3(int num1, int num2)
	{
		a=num1;
		b=num2;
		System.out.println("Running constructor with two parameters");
	}
	
	public CS3(int num1, int num2, int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("Running constructor with three parameters");
	}
	public static void main(String[] args) {
	
	CS3 C3=new CS3();
	C3.addition();
	
	CS3 C40=new CS3(100,200);
    C40.addition();
    
    CS3 C41=new CS3(-10,-20,40);
    C41.addition();
    
	}
	public void addition()
	{
		int sum=a+b+c;
		
		System.out.println("The addition is "+sum);
	}


}
