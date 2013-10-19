package lukino;

import gogishvili.interfaces.Circle;
import gogishvili.interfaces.Color;
import gogishvili.interfaces.House;
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
		
		House h = new House();
		h.setArea(70);
		h.setPrice(10000);
		h.setRoomCount(5);
		
		Circle c = new Circle();
		c.setX(10.5);
		c.setY(5.12);
		c.setR(15654);
		c.setC(Color.BLUE);
		
		
		
		
		Test t = new Test();
		t.Printer(s);
		t.Printer(h);
		t.Printer(c);
	}

}
