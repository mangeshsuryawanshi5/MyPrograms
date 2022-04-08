package interface_study;

public class Final_KeywordUse {

	int a=10;// global variable
	final int b=40;
	public static void main(String[] args) {
		
		Final_KeywordUse f= new Final_KeywordUse();// created object
		f.add();
			}
	
	public void add()
	{
		a=a+20;
		System.out.println("Updated value of a is "+a);
		//b= b+20; in final variable we cant update value
	}
	

}