package kodlamaio3.GünOdev2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	List<Student> students = new ArrayList<Student> ();

	public void add(Student student) {
		System.out.println("Student eklendi : " + student.getFirstName() + " " + student.getLastName() + ", Course Name : "
				+ student.getCourseName());
		students.add(student);
		
	}

	public void delete(Student student) {
		System.out.println("Student silindi : " + student.getFirstName() + " " + student.getLastName() + ", Course Name : "
				+ student.getCourseName());
	}

	public void update(Student student) {
		System.out.println("Student güncellendi : " + student.getFirstName() + " " + student.getLastName() + ", Course Name : "
				+ student.getCourseName());
	}
	
	public List<Student> getAll() {

		return students;
	}

}
