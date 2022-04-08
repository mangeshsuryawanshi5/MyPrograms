package casting;

public class CastTest {
	
	public static void main(String[] args) {
		
		//Implicit casting lower-->higher
		
		int a=10;
		System.out.println("Valuue of a is "+a);
		
		double b=a;
		System.out.println("Value of b is "+b);
		
		//Explicit casting higher-->lower
		
		System.out.println("========================");
		
		double c=10.234;
		
		System.out.println("Value of c is "+c);
		
		int d=(int) c;
		System.out.println("Value of d is "+d);
	}

}
