package serializationWithInheritance.example3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception {
		// Admin object instantiation
		Admin admin1 = new Admin("Admin_1", 0001);
		// Display name and id from Admin object before Serialization
		System.out.println("Name: " + admin1.name);
		System.out.println("ID: " + admin1.id);
		// Serialization
		FileOutputStream fos = new FileOutputStream("output.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(admin1);
		oos.close();
		fos.close();
		System.out.println("The Object has been serialized!");
		// Deserialization
		FileInputStream fis = new FileInputStream("output.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Admin admin2 = (Admin) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("The Object has been deserialized!");
		// Display name and id from Admin object after Serialization
		System.out.println("Name: " + admin2.name);
		System.out.println("ID: " + admin2.id);
	}
}
