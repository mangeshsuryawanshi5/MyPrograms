package abstract_study;

public class Concrete extends Sample {

	public static void main(String[] args) {
		// you can create object of concrete class
		
		Concrete c= new Concrete();
		c.test1();
		c.test2();
		c.test3();
		c.test5();

	}

	
	public void test3() {
		// this incomplete method completed in concrete class
		System.out.println("Test3 method completed in concrete class");
		
	}
	
	public  void test5()
	{
		System.out.println("Method from concrete class");
	}

}