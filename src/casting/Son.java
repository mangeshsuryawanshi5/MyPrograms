package casting;

public class Son extends Father{

	public static void main(String[] args) {
		
		//Creating object of subclass and giving superclass reference
		
		Father f=new Father(); //Creating object of father
		f.money();
		
		Son s=new Son(); //Craeting object of Son
		s.money();
		
		Father F=new Son();
		F.money();
		//F.bike(); //We cant call the method which is not common
		

	}
	
	public void money() //overrided
	{
		System.out.println("Son's money 1L");
	}
	
	public void bike() //Son's own property
	{
		System.out.println("Son's bike pulser");
	}

}
