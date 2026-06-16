package aggregation;

public class Person {
	// Creating attributes
	String name;
	int age;
	
	// Creating methods
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayDetails() {
		System.out.println(" Name: " +name);
		System.out.println(" Age: " +age);
	}
	
}
