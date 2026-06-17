package abstraction;

public abstract class AbstractClass1 {
	
	public void display() {
		System.out.println("display- abstract class non abstract method");
	}
	public AbstractClass1(){
		System.out.println("Abstract class constructor");
	}
	public static void displayDetails() {
		System.out.println("displayDetails- abstract class static method");
	}
	public abstract void print();
}
