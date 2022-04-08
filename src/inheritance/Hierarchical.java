package inheritance;

public class Hierarchical {

	public static void main(String[] args) 
	{
		Son1 s1= new Son1();// creating object of sub class
		s1.mobile();// calling own method
		s1.money();// calling super class method using subclass object
		
		Son2 s2= new Son2();// creating object of sub class
		s2.laptop();//calling own method
		s2.money();// calling super class method using subclass object

		
		Father.test();
		Son1.test();
		Son2.test();
	}

}