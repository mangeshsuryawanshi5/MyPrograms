package Method;

public class Example3 {

	public static void main(String[] args) {
		// calling static method from same class
		test();
		
		//calling static method from different class--->syntax= classname.methodname();
		
		example1.test1();
		
		//calling static method from different class--->syntax= classname.methodname();
		example2.A();
		

	}

	public static void test()
	{
		System.out.println("Running static method from example1");
}
}
