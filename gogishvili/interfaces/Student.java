package gogishvili.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Printable {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	public void print() {
		System.out.println("First name: " + firstName + "; Last name: " + lastName + "; Birth date: " + sdf.format(birthDate) + "; ");
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


}
