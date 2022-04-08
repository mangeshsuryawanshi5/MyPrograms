package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		Daughter d= new Daughter();
		d.experience();//calling property from supermost class
		d.look();// calling property form super class
		d.money();//calling property form super class
		d.mobile();//calling property form own class
		Daughter.nature();// calling static method from Super class using subclass name
		Daughter.scooty();//calling static method from subclass using subclass name

	}

}