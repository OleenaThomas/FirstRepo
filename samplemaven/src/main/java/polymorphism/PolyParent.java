package polymorphism;

public class PolyParent {
	String name;
	
	public PolyParent() {
		System.out.println("Parent class constructor");
	}
	
	public void display(String name) {
		this.name=name;
		System.out.println("Name of parent class: " +name);
	}
}
