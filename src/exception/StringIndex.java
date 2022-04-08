package exception;

public class StringIndex {

	public static void main(String[] args) {
		
       String name="Velocity";
		
		try {
		
	   System.out.println(name.charAt(7));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("enter CharAT argument between 0-7");
		}

	}

}