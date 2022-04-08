package control_statement;

public class Nested_If_Else_Study {

	
//	//If username is correct the please enter password, if your password is correct then
//	"Login Successful" Welcome.
	
//	If password is wrong then please check your password, else incorrect username.
	
	
	public static void main(String[] args) {
		

 String Username="Velocity";
 String Password="Velocity@123";

	
	

	if (Username=="Velocity")
	{
		System.out.println("Username is Correct, please enter password");
	
	if (Password=="Velocity@123")
	{
		System.out.println("Correct password login successful");
	}
	
	else
	{
		System.out.println("Please check your password");
	}
	
	}
	else
	{
		System.out.println("Incorrect Username");
	}

}
	
}