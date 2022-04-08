package variable_types;

public class Global_Variable {

	int a=10; // Global variable non-static
	static int b=20; //Global variable static
	
	
	public static void main(String[] args) {
		
System.out.println("The value of b is "+b); // Calling global static variable

Global_Variable gv=new Global_Variable(); //Created object of a class

System.out.println("The value of a is "+gv.a); //Calling global non static variable

gv.test(); // Calling non static method
test1(); // Calling static method


	}
public void test()
{
int c=10; // local variable
int sum=c+a; //Using global variable adding in local variable
 System.out.println("The addition is "+sum); 
 
 //int sum1=a+d; -->we can not use local(d) variable from another class 
}

public static void test1()
{
int c=30;  //Local variable
int d=40;  //Local variable

int sub=d-b-c; //Using global static variable

System.out.println("The subtraction is "+sub);
}
}
