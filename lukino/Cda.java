package lukino;

import gogishvili.interfaces.Student;

import java.util.Calendar;

public class Cda {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,  1991);
		calendar.set(Calendar.DAY_OF_MONTH, 07);
		calendar.set(Calendar.MONTH, 11);
				
		Student s = new Student();
		s.setFirstName("gio");
		s.setLastName("Gurgenashvili");
		s.setBirthDate(calendar.getTime());
		
		Test t = new Test();
		t.Printer(s);
	}

}
