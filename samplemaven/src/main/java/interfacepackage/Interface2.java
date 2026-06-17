package interfacepackage;

public class Interface2 implements Interface1{
	public void show() {
		System.out.println("show- child class instance method");
	}
	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.show();
		obj.display();
		obj.print();
		// Interface reference creation
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();
	}
	@Override
	public void display() {
		System.out.println("display- interface abstract method");	
	}
	@Override
	public void print() {
		System.out.println("print- interface abstract method");		
	}

}
