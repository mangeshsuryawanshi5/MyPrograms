package generalisation;

public class Jio implements TRAI{

	@Override
	public void call() {
		System.out.println("Jio Call-1Rs/Min");
		
	}

	@Override
	public void SMS() {
		System.out.println("Jio SMS-100SMS/Day");
		
	}

	@Override
	public void Data() {
		System.out.println("Jio Data-1GB/Day");
		
	}
	
	public void JioTV()
	{
		System.out.println("Jio-HotStar 1 Month");
	}

}