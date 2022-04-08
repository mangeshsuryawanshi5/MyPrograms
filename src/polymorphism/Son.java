package polymorphism;

public class Son extends Father {

	public static void main(String[] args)
	{
		Father f= new Father();// super class object
		Son s= new Son();// subclass object
		
		f.money();
		f.money();
		s.money();

	}
	//overriding super class method
	public void money()
	{
		System.out.println("Sons money 12K");
	}

}