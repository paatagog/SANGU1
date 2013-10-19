package Svanadze.interfaces;

import java.util.Calendar;
import gogishvili.interfaces.*;

public class Test {
	public static void main(String[] args) {				
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1992);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, 8);

		Student student = new Student();
		student.setFirstName("Giorgi");
		student.setLastName("Svanadze");
		student.setBirthDate(cal.getTime());
		
		House house = new House();
		house.setArea(199.5);
		house.setPrice(95000);
		house.setRoomCount(5);

		Circle circle = new Circle();
		circle.setX(5);
		circle.setY(3);
		circle.setR(15);
		circle.setC(Color.GREEN);
		
		Print p = new Print();
		p.Printer(student);
		p.Printer(house);
		p.Printer(circle);
	}
}
