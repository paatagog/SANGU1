package gogishvili.interfaces;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("George");
		student.setLastName("Giorgadze");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1986);
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 11);
		student.setBirthDate(c.getTime());
		
		// TODO
	}

}
