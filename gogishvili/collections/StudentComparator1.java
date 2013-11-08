package gogishvili.collections;

import gogishvili.classes.Student;

import java.util.Comparator;

public class StudentComparator1 implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStartDate().compareTo(s2.getStartDate());
	}

}
