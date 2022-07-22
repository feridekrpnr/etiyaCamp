package kodlamaio3.GünOdev2;

public class Student extends User {
	
	private String courseName;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String emailAdress, String nationalIdentity,
			String courseName) {
		super(id, firstName, lastName, emailAdress, nationalIdentity);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	
	
	
	
}
