package singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static volatile SerializedSingleton instance = null;
	
	 private static final long serialVersionUID = 1L;
	
	private int i =10;
	
	public static SerializedSingleton getInstance(){
		if(instance == null)
			instance = new SerializedSingleton();
		return instance;
	}
	
	protected Object readResolve() {
        return instance;
    }
	
	public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}
