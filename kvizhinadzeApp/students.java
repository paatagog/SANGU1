package kvizhinadzeApp;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class students {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	private String firstName;
	private String lastName;
	private Date date;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(String date) throws ParseException {
		this.date = sdf.parse(date);
	}
	public static int getAge(final Date birthdate) {

		  Calendar current = Calendar.getInstance();
		  
	    if (birthdate == null) {
	      return 0;
	    }
	    if (current == null) {
	      return getAge(birthdate);
	    } else {
	      final Calendar calend = new GregorianCalendar();
	      calend.set(Calendar.HOUR_OF_DAY, 0);
	      calend.set(Calendar.MINUTE, 0);
	      calend.set(Calendar.SECOND, 0);
	      calend.set(Calendar.MILLISECOND, 0);

	      Date d = new Date();
	      d.setTime(current.getTime().getTime() - birthdate.getTime());
	      calend.setTime(d);

	      int result = 0;
	      result = calend.get(Calendar.YEAR) - 1970;
//	      result += (float) calend.get(Calendar.MONTH) / (float) 12;
	      return result;

	    }

	  }
	
}
