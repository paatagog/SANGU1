package gogishvili.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private Sex sex;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlAttribute
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlElement
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName: ").append(firstName)
		.append("; Lastname: ").append(lastName)
		.append(" Age: ").append(age)
		.append(" Sex: ").append(sex);
		
		return sb.toString();
	}

}
