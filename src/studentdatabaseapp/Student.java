package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
    
	// constructor to prompt user to enter student name & year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student first Name :");
		this.firstName = scanner.nextLine();
		System.out.println("Enter student last name :");
		this.lastName = scanner.nextLine();
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = scanner.nextInt();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	// generate studentID ( 5 digits)
	public void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// enroll in courses
	 public void enroll() {
		Scanner scanner = new Scanner(System.in);
		String course;
		do {
		System.out.println("enter course to Enroll (Q to Quit):");
		course = scanner.nextLine();
		if (!course.equals("Q")) {
			this.courses = this.courses + "\n" + course; 
			this.tuitionBalance += costOfCourse;
			System.out.println("the " + this.tuitionBalance);
		} else 
			break;
		}
		while (!course.equals("Q"));
		System.out.println("ENROLLED IN :" + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	 }

	// view balance
	 public void viewBalance() {
		 System.out.println("Your balance is: $ " + tuitionBalance);
	 }

	// pay Tuition
	 public void payTuition(int payment) {
		 this.tuitionBalance = this.tuitionBalance - payment;
		 viewBalance();
	 }

	// show status
}
