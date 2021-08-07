package serializationWithInheritance.example1;

import java.io.Serializable;

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
}
