package Method;

public class example1 {

	public static void main(String[] args) {
	System.out.println("Running main method");
	//main method
	test1();
	
	//calling static regular method
	test2();
	test2();
	
	//To calling static regular method from same class
	System.out.println("Ending main method");
	
	}
	
	//Public static void main(); //Incomplete method // It not contain body
public static void test1()
{
	System.out.println("Runing satic regular method test1");
	
}
	
// Public static void main test1() // complete method  // It contains body

public static void test2()
{
	System.out.println("Running static regular method test2");
}

	
	
}




