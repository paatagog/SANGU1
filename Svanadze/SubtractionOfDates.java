package Svanadze;

import java.sql.Date;
import java.util.Calendar;

public class SubtractionOfDates {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar s = Calendar.getInstance();
		Date date = new Date(110,0,1);
		long current = System.currentTimeMillis();

		cal.setTimeInMillis(current);
		cal2.setTime(date);

		long sum = cal.getTimeInMillis() - cal2.getTimeInMillis();
		s.setTimeInMillis(sum);
		System.out.println("Mimdinare Tarigi: " + cal.getTime());
		System.out.println("Dasamatebeli Tarigi: " + cal2.getTime());
		System.out.println("Saboloo Tarigi: " + s.getTime());
	}
}