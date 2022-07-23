package kodlamaio3.GünOdev2;


public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engin@gmail.com", "31325158999", 30000);

		Student student1 = new Student(2, "Feride", "Karpınar", "feride@gmail.com", "31325158222", "Java");
		Student student2 = new Student(3, "Gonca", "Bal", "gonca@gmail.com", "41325158222", ".Net");

		
//		StudentManager studentManager = new StudentManager();
//		studentManager.add(student1);
//		studentManager.add(student2);
//		System.out.println("-----------------------");
//		
//	    InstructorManager instructorManager = new InstructorManager();
//	    instructorManager.add(instructor);
//	    System.out.println("-----------------------");
	    
		UserManager userManager = new UserManager();
		userManager.add(instructor);
		
		userManager.add(student1);
		userManager.add(student2);
		for (User user : userManager.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
				
	}

}
