package generalisation;

public class AirTel implements TRAI{

	@Override
	public void call() {
		System.out.println("Airtel-Call-.50Rs/Min");
		
	}

	@Override
	public void SMS() {
		System.out.println("Airtel SMS-150SMS/Day");
		
	}

	@Override
	public void Data() {
		System.out.println("Airtel Data-1GB/Day");
		
	}
	
	public void AirTelMoney()
	{
		System.out.println("Airtel-AirTelMoney");
	}


}