package superkeyword;

public class Child extends SuperParent{

	String name="This is a child variable.";
	
	Child(){
		super();
		System.out.println("Child constructor");
	}
	
	void show() {
		System.out.println("Child method");
	}
	
	void display() {
		// Accessing variables
		System.out.println("Child variable: " +name);
		System.out.println("Parent variable: "+super.name);
		
		// Accessing methods
		show();
		super.show();
	}
	
	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.display();
	}

}
