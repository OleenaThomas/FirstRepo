package aggregation;

public class Student extends Person {
	// Creating attributes
	String grade;
	int rollNumber;
	
	// Accept parent attributes in the constructor 
	public Student(String name, int age, String grade, int rollNumber) {
		super(name,age);
		this.grade=grade;
		this.rollNumber=rollNumber;
	}
	
	public void displayDetails() {
		System.out.println("Student Information");
		super.displayDetails(); // Prints name & age
		System.out.println(" Grade: " +grade);
		System.out.println(" Roll Number: " +rollNumber);
	}
}
