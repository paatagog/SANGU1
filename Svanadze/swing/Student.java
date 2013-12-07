package Svanadze.swing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="სტუდენტი")
@XmlType(propOrder = {"firstName", "lastName", "age"})
public class Student {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String firstName;

	private String lastName;

	private Date date;
	
	@XmlElement(name="სახელი")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement(name="გვარი")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlTransient
	public Date getDate() {
		return date;
	}

	@XmlElement(name="ასაკი")
	public int getAge() {
		Calendar dob = Calendar.getInstance();
		dob.setTime(date);
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
				&& today.get(Calendar.DAY_OF_MONTH) < dob
						.get(Calendar.DAY_OF_MONTH)) {
			age--;
		}
		return age;
	}

	public void setDate(String date) throws ParseException {
		this.date = sdf.parse(date);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName: ").append(firstName).append("; Lastname: ")
				.append(lastName).append(" Birth date: ")
				.append(sdf.format(date));

		return sb.toString();
	}

}
