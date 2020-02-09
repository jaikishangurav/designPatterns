package singleton;

public class LazySingleton {
	private static volatile LazySingleton instance = null;
	
	private LazySingleton(){
		
	}
	
	public LazySingleton getSingleton(){
		if(instance==null){
			synchronized(LazySingleton.class){
				//double check
				if(instance==null)
					instance = new LazySingleton();
			}
		}
		return instance;
	}
}
