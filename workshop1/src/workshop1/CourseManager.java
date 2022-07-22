package workshop1;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

	private List<Course> courses = new ArrayList<>();
	
	public void add(Course course) {
		courses.add(course);
		System.out.println("Kurs eklendi " + course.getName());
	}
	
	public List<Course> getAll() {
		return courses;
	}
	
	public void addToCart(Course course) {
		System.out.println("Sepete eklendi " + course.getName());
	}
	
}
