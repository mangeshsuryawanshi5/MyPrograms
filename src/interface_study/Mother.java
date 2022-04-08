package interface_study;

public interface Mother {
	
	default void love()
	{
		System.out.println("Mothers Love");
	}
	
	static void nature()
	{
		System.out.println("Mothers nature");
	}


}
