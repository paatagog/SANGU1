package Svanadze.swing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="სტუდენტები")
public class StudentList {
	
	private List<Student> students = new ArrayList<Student>();

	@XmlElement(name="სტუდენტი")
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
