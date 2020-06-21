package emailapp;

import java.util.Scanner;
import bankaccountapp.Account;
public class Email {
	// private = encapsulation
	private String firstName;
	private String lastName;
	private String pasword;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	

	// constructor to recieve the first & last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// call a method for department
		this.department = setDepartment();
		// call a method for random password
		this.pasword = randomPassword(this.defaultPasswordLength);
		System.out.println("Your password is: " + this.pasword);
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "."
				+ this.companySuffix;
	}

	// Ask for the department
	private String setDepartment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("New worker: " + firstName
				+ " .DEPARTMENTS CODES\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none");
		System.out.println("Enter department code:");
		int departmentChoice = scanner.nextInt();
		if (departmentChoice == 1) {
			return "sales";
		} else if (departmentChoice == 2) {
			return "dev";
		} else if (departmentChoice == 3) {
			return "acct";
		} else {
			return "";
		}
	}

	// Change the password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);

	}

	// because there are not necessary we didn't put them inside the constructor
	// Set the mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public void changePasword(String pasword) {
		this.pasword = pasword;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getPassword() {
		return pasword;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public int getDefaultPasswordLength() {
		return defaultPasswordLength;
	}

	public void setDefaultPasswordLength(int defaultPasswordLength) {
		this.defaultPasswordLength = defaultPasswordLength;
	}

	public String showInfo() {
		return "Display name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity: "
				+ mailboxCapacity + "mb";
	}
	public int cc (int a, int b ) {
		return 0;
	}
	public int cc (String a, int b) {
		return 0;
	}

}
