package gogishvili.classes;

import java.util.Calendar;
import java.util.Date;

public class Student {
	
	private String university;
	
	private String faculty;
	
	private Date startDate;
	
	public int year() {
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		Calendar present = Calendar.getInstance();
		present.setTime(new Date());
		return present.get(Calendar.YEAR) - start.get(Calendar.YEAR) + 1;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
