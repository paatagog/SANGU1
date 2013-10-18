package Svanadze.memkvidreobitoba;

public class Baby extends Person {
	private String parentName;

	public Baby(String name, String parentName, int age, int id) {
		this.name = name;
		this.age = age;
		this.ID = id;
		this.parentName = parentName;
	}

	public void whoIsParent() {
		System.out.println(name + "'s parent is " + parentName);
	}

	public void cry() {
		System.out.println(name + " is crying...");
	}

	public void speak() {
		System.out.println(name + " is speaking: Blaa Blaa Blaa... :)))))");
	}
}