package control_statement;

public class Switc_Study2 {

	public static void main(String[] args) {
		
		char Grade='D';
		
		
		switch (Grade)
		{
		case 'A': System.out.println("My marks are >=75");
		break;
		
		case 'B': System.out.println("My marks are in between 60 to 74");
		break;
		
		case 'C': System.out.println("My marks are in between 50 to 60");
		break;
		
		case 'D': System.out.println("My marks are in between 40 to 50");
		break;
		
		default : System.out.println("Please valid value between 40 to 75");
		break;
		}
		

	}

}
