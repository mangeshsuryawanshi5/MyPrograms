package control_statement;

public class Else_If_Study2 {

	public static void main(String[] args) {
		
   Else_If_Study2 IF=new Else_If_Study2(); // Created Object
   
   IF.testGrade(); // Calling method
	}
    
	public void testGrade()
	{
		//If my grade is
		//A-->%>=75
		//B-->%>=60<=75
		//C-->>40<60
		//D-->Fail
	
		char Grade='A';
		
		if (Grade=='A')
		{
			System.out.println("My marks are =>75%");
		}
		
		else if (Grade=='B')
		{
			System.out.println("My marks are >=60<=75%");
		}
		
		else if (Grade=='C')
		{
			System.out.println("My marks are>40<60");
		}
		
		else
		{
			System.out.println("I am failed");
		}
	
	}
}
