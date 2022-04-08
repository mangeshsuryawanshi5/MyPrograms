package Method;

public class Example6 {

	public static void main(String[] args) {

Example6 E6=new Example6();

E6.UnipuneResult();
E6.UnipuneResult1("Trinity", 120, 'C', 64.32f);
E6.UnipuneResult1("MIT", 85, 'A', 98.65f);

Example5 E5=new Example5();
E5.additon1(25, 30);
	}
public void UnipuneResult()

{
String collegename="COEP";
int collegecode=100;
char grade='A';
float percentageresult=75.8f;

System.out.println("========================================");
System.out.println("The college name is "+collegename);
System.out.println("The collegecode is "+collegecode);
System.out.println("The grade is "+grade);
System.out.println("The percentage result is "+percentageresult);
System.out.println("=========================================");
}

public void UnipuneResult1(String collegename, int collegecode, char grade, float percentageresult)
{

System.out.println("========================================");
System.out.println("The college name is "+collegename);
System.out.println("The collegecode is "+collegecode);
System.out.println("The grade is "+grade);
System.out.println("The percentage result is "+percentageresult);
System.out.println("=========================================");
}



}
