package generalisation;

public class VI implements TRAI{
	@Override
	public void call() {
		System.out.println("VI-Call-1.50Rs/Min");
		
	}

	@Override
	public void SMS() {
		System.out.println("VI SMS-200SMS/Day");
		
	}

	@Override
	public void Data() {
		System.out.println("VI Data-2.5GB/Day");
		
	}
	
	public void D2H()
	{
		System.out.println("VI-D2H");
	}


}