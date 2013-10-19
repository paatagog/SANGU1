package gurgenashvili;

import gogishvili.interfaces.Student;

import java.util.Calendar;

public class cda {
	
	public static void main (String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1992);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		calendar.set(Calendar.MONTH, 05);
		
		Student s = new Student();
		s.setFirstName("luka");
		s.setLastName("grdzelishvili");
		s.setBirthDate(calendar.getTime());
		
		test t = new test();
		t.Printer(s);
		
	}

}
