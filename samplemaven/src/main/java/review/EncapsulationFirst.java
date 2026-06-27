package review;

public class EncapsulationFirst {
	private int age;
	private String name;
	
	public void getter() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
	
	public void setter(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
}
