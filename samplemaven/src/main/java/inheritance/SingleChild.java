package inheritance;

public class SingleChild extends SingleInheritance {
	public void childDisplay() {
		System.out.println("Fetching value from parent class " +age);
	}
	public static void main(String[] args) {
		System.out.println("This static variable from parent: " +name);
		System.out.println("Printing from child class");
		SingleChild obj1=new SingleChild();
		obj1.childDisplay();
		System.out.println("Fetching value from parent class using object " +obj1.age);
		obj1.display();
	}
}
