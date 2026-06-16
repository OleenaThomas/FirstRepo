package aggregation;

public class Teacher extends Person {
	// Creating attributes
	String subject;
	int salary;
	
	// Creating methods
	public Teacher(String name, int age, String subject, int salary) {
		super(name, age);
		this.subject=subject;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Teacher Details");
		super.displayDetails();// Prints name & age
		System.out.println(" Subject: " +subject);
		System.out.println(" Salary: " +salary);
	}
}
