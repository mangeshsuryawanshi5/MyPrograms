package variable_types;

public class Employee {

	//Name--> String
	//Emp Code-->1234 int
	//Grade-->A,B,C,D char
	//Salary-->12452.125 float
	
	String Emp_Name; //Declaring global non static variable
	int Emp_code;
	char Emp_Grade;
	float Emp_Salary;
	
	public void emp_info()
	{
		System.out.println("========================");
		System.out.println("Employee name is "+Emp_Name);
		System.out.println("Employee code is "+Emp_code);
		System.out.println("Employee grade is "+Emp_Grade);
		System.out.println("Employee salary is "+Emp_Salary);
		
	}
	
	public void emp_detail()
	{
		
	}
}
