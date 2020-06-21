package studentdatabaseapp;

public class StudentDatabseApp {

	public static void main(String[] args) {
		// ask the user how many students will be added to db
		System.out.println(StudentDatabseApp.class.getName());
		Student student1 = new Student();
		// create n number of new staudents
		student1.enroll();
	}
}
