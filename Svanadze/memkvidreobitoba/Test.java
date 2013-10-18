package Svanadze.memkvidreobitoba;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Giorgi");
		person.setAge(21);
		person.setID(123456789);

		Baby baby = new Baby("Mari", person.getName(), 3, 987654321);

		System.out.println("NAME: " + person.getName());
		System.out.println("AGE: " + person.getAge());
		System.out.println("ID: " + person.getID());
		person.breath();
		person.eat();
		person.speak();
		person.study();

		System.out.println("* * *");

		System.out.println("NAME: " + baby.getName());
		System.out.println("AGE: " + baby.getAge());
		System.out.println("ID: " + baby.getID());
		baby.whoIsParent();
		baby.breath();
		baby.cry();
		baby.eat();
		baby.speak();
		baby.study();
	}
}
