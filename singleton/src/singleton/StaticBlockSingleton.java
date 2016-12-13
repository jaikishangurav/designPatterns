package singleton;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton INSTANCE;
	
	static{
		INSTANCE = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance()
	{
		return INSTANCE;
	}
}
