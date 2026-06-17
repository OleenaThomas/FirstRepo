package abstraction;

public class AbstractClass2 extends AbstractClass1 {
	
	
	public void childMethod() {
		System.out.println("childMethod- child class method");
	}
	
	public AbstractClass2() {
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		AbstractClass2 obj=new AbstractClass2();
		obj.print();
		obj.display();
		displayDetails();
		obj.childMethod();
	}
	@Override
	public void print() {
		System.out.println("print- abstract class abstract method");
	}
}
