package interface_study;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		
		Son s=new Son();
		s.money();
		s.love();
		s.rules();
		Father.nature();
		Mother.nature();

	}

	@Override
	public void money() {
		System.out.println("Fathers money completed Sons class");
		
	}

	@Override
	public void rules() {
		System.out.println("Fathers rules completed Sons class");
		
	}

	@Override
	public void look() {
		System.out.println("Fathers lookss completed Sons class");
		
	}

	@Override
	public void love() {
		
		Father.super.love();
		Mother.super.love();
	}

}
