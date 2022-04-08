package Method;

public class example4 {

	public static void main(String[] args) {
		// Calling non static method need to create object
		
		//Creating object
		
		//Syntax to create object= classname object name=new classname();
		
		example4 E4=new example4();
		
		
		//Syntax to call non static method= objectname.methodname();
		E4.test1();
		E4.test2();
		E4.test2();
		E4.test3();	
	

	}
public void test1()
{
System.out.println("This public non static test1 running ");	
}

public void test2()

{
System.out.println("This is public non static test2 running ");
}
public void test3()

{
System.out.println("This non static test3 running");
}
}
