package serializationWithInheritance.example2;

import java.io.Serializable;

public class User {
	String name;

	public User(String name) {
		this.name = name;
	}
	public User() {
		name = "User_2";
		System.out.println("User class Contructor has been called");
	}
}

// Class implementing Serializable
class Admin extends User implements Serializable{
	int id;

	public Admin(String name, int id) {
		super(name);
		this.id = id;
	}
}