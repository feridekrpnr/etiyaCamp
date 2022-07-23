package kodlamaio3.GünOdev2;

public class Instructor extends User {
	private double salary;

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String emailAdress, String nationalIdentity,
			double salary) {
		super(id, firstName, lastName, emailAdress, nationalIdentity);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
	
	

}
