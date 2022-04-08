package variable_types;

public class HR_Portal {

	public static void main(String[] args) {
		
		Employee Mangesh=new Employee();
		Mangesh.Emp_Name="Mangesh Suryawanshi";
		
		Mangesh.Emp_code=18;
		Mangesh.Emp_Grade='A';
		Mangesh.Emp_Salary=30185f;
		
		Mangesh.emp_info();
		
		Employee Arvind=new Employee();
		Arvind.Emp_Name="Arvind Kashte";
		Arvind.Emp_code=45;
		Arvind.Emp_Grade='B';
		Arvind.Emp_Salary=36458.56f;
		
		Arvind.emp_info();
		
	}

}
