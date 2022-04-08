package interface_study;

public interface Father {
	
	void money();
	void rules();
	void look();
	default void love()
	{
		System.out.println("Fathers Love");
	}
	
	static void nature()
	{
		System.out.println("Fathers nature");
	}

}
