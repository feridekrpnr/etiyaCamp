package arrays;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "rabia", "çakır");
		Student student2 = new Student(2, "elif", "kaya");
		Student student3 = new Student(3, "melisa", "varol");

		Student[] students = new Student[] { student1, student2, student3 };

		System.out.println("student1 : " + student1);
		System.out.println("student[0] : " + students[0]);
		System.out.println("**************************************************************");

		System.out.println("student2 : " + student2);
		System.out.println("student[1] : " + students[1]);
		System.out.println("**************************************************************");

		System.out.println("student3 : " + student3);
		System.out.println("student[2] : " + students[2]);
		System.out.println("**************************************************************");
		student2 = student1;
		student1 = student3;

		System.out.println("REFERANS ATAMASINDAN SONRA");
		System.out.println("student1 : " + student1);
		System.out.println("student[0] : " + students[0]);
		System.out.println("**************************************************************");

		System.out.println("student2 : " + student2); // student1'in referansını tutuyor
		System.out.println("student[1] : " + students[1]); // student2=student[1]
		System.out.println("**************************************************************");

		System.out.println("student3 : " + student3);
		System.out.println("student[2] : " + students[2]);
		System.out.println("**************************************************************");

		students = new Student[] { student1, student2, student3 };

		System.out.println("YENİ DİZİ OLUŞTURDUKTAN SONRA");
		System.out.println("student1 : " + student1);
		System.out.println("student[0] : " + students[0]);
		System.out.println("**************************************************************");

		System.out.println("student2 : " + student2);
		System.out.println("student[1] : " + students[1]);
		System.out.println("**************************************************************");

		System.out.println("student3 : " + student3);
		System.out.println("student[2] : " + students[2]);
		System.out.println("**************************************************************");

	}

}
