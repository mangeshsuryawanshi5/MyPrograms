package control_statement;

public class Switch_Study {

	public static void main(String[] args) {
	
		//If my year is
		
	//1: I am in 1st year of engg
	//2: I am in 2nd year of engg
	//3: I am in 3rd year of engg
	//4: I am in 4th year of engg
	//Please enter valid value between 1-4---> Default
		
		int year=1;
		
		switch (year)
		{
		case 1: System.out.println(" I am in 1st year of engg");
		break;
		
		case 2: System.out.println(" I am in 2nd year of engg");
		break;
		
		case 3: System.out.println(" I am in 3rd year of engg");
		break;
		
		case 4: System.out.println(" I am in 4th year of engg");
		break;
		
		default: System.out.println("Please enter valid value between 1-4");
		break;
		}

	}

}
