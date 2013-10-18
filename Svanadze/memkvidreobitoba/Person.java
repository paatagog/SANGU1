package Svanadze.memkvidreobitoba;

public class Person {
	protected String name;
	protected int age;
	protected int ID;
	
	public void eat() {
		System.out.println(name + " is eating...");
	}
	
	public void breath() {
		System.out.println(name + " is breathing...");
	}
	
	public void speak() {
		System.out.println(name + " is speaking...");
	}
	
	public void study() {
		System.out.println(name + " is studying...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
