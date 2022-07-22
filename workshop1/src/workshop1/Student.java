package workshop1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private final List<Course>courses= new ArrayList<>();
	
	public Student() {
	}

	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<Course> getCourses() {
		return courses;
	}
	
	public String getName() {
		return getFirstName() +  " "  + getLastName();
	}
	
	public void addToStudentCourseList(Course course) {
		courses.add(course);
	}
	
	
	
	
	
	
	
}
