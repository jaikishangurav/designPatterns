package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationTest {
	static SerializedSingleton instanceOne = SerializedSingleton.getInstance();
	
	public static void main(String args[]){
		 
		try {
			// Serialize to a file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
			        "filename.ser"));
			out.writeObject(instanceOne);
	        out.close();
	        instanceOne.setI(20);
	        
	        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
	        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
            in.close();
 
            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
	        
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
