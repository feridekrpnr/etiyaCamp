package kodlamaio3.GünOdev2;

import java.util.List;

public class InstructorManager {
	
	private List<Instructor> instructors;
	
	public void add(Instructor instructor) {
		System.out.println("Instructor eklendi: "+ instructor.getFirstName() + " " + instructor.getLastName()
				+ ", Salary : " + instructor.getSalary());
		instructors.add(instructor);
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Instructor silindi: "+ instructor.getFirstName() + " " + instructor.getLastName()
				+ ", Salary : " + instructor.getSalary());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Instructor güncellendi: "+ instructor.getFirstName() + " " + instructor.getLastName()
				+ ", Salary : " + instructor.getSalary());
	}
	
	public List<Instructor> getAll() {

		return instructors;
	}
}
