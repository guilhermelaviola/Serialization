package serializationWithStaticMember;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StaticSerialization implements Serializable {
	static int x = 50; // static member belongs to the class, not to the object
	public static void main(String[] args) {
		StaticSerialization obj = new StaticSerialization();
		System.out.println("At the time of Serialization, the static member value is: " + x);
		try {
			// Serialization
			// Writing the saved state of the object
			FileOutputStream fos = new FileOutputStream("C:\\File.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// Serializing (in other words, saving the state of the object obj)
			oos.writeObject(obj);
			oos.close();

			x = 49; // The static member's value changed to 49
			
			// Deserialization
			FileInputStream fis = new FileInputStream("C:\\File.ser"); // Reading the same file for deserialization
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj=(StaticSerialization)ois.readObject(); // Deserializing (in other words restoring the object to its initial form)
			ois.close();
			System.out.println("After Deserialization, the static member value is: " + x);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}