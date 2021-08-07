package serializationWithInheritance.example3;

import java.io.Serializable;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Class implementing Serializable
class User implements Serializable {
	String name;

	public User (String name) {
		this.name = name;
	}
}
class Admin extends User {
	int id;

	public Admin (String name, int id){
		super(name);
		this.id = id;
	}

	private void writeObject(ObjectOutputStream out) throws Exception {
		throw new NotSerializableException();
	}
	private void readObject(ObjectInputStream out) throws Exception {
		throw new NotSerializableException();
	}
}