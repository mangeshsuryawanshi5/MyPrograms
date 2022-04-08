package constructor;

public class CS2 {

	public static void main(String[] args) {
		// initialize variables
		
CS2 C2=new CS2();
C2.CS21();
C2.CS22(10, 20.25f, 'A');
C2.CS22(3, 8.888f, 'C');

	}
public void CS21()
{

int a=8;
int b=12;
int sum=a+b;

System.out.println("The addition is "+sum);
}

public void CS22(int a, float b,  char c)

{
	System.out.println("==================");
System.out.println("The int Value is "+a);
System.out.println("The float value is "+b);
System.out.println("The char value is "+c);
}
}
