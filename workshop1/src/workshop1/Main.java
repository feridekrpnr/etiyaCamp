package workshop1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Yazılım");
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		Course course1 = new Course(1, "Java", instructor1, category1);
		Course course2 = new Course(1, ".Net", instructor1, category1);
		Student student1 = new Student(1,"Feride", "Karpınar");
		student1.addToStudentCourseList(course1);
		student1.addToStudentCourseList(course2);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		
		System.out.print("Tüm kurslar : " );
		
		for (Course course : courseManager.getAll()) {
			System.out.printf(course.getName() + " ");
		}
		System.out.println();
		System.out.printf(student1.getName() + " isimli ögrenciye ait kurslar : " );
		
		for (Course course : student1.getCourses()) {
			System.out.printf( course.getName() + " ");
		}
	}

}
