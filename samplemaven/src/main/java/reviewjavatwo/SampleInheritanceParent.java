package reviewjavatwo;

public class SampleInheritanceParent {
	String name;
	int age;
	
	public SampleInheritanceParent(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void print() {
		System.out.println("This is instance method from parent class.");
	}
}
