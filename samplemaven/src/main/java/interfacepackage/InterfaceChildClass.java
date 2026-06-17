package interfacepackage;

public class InterfaceChildClass implements InterfaceParent1,InterfaceParent2{

	public void show() {
		System.out.println("show- child class instance method");
		display();
		print();
	}
	public static void main(String[] args) {
		InterfaceChildClass obj=new InterfaceChildClass();
		obj.show();
		obj.display();
		obj.print();
	}

	@Override
	public void print() {
		System.out.println("print- interface parent2 abstract method");
	}

	@Override
	public void display() {
		System.out.println("display- interface parent1 abstract method");
	}

}
