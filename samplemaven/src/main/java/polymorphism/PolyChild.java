package polymorphism;

public class PolyChild extends PolyParent{
	String name;
	public void display(String name) {
		this.name=name;
		System.out.println("Name of child class: "+name);
	}
	public PolyChild() {
		super();
		System.out.println("Child class constructor");
	}
	public void show() {
		display("ChildName");
		super.display("ParentName");
	}
	
	public static void main(String[] args) {
		PolyChild obj1=new PolyChild();
		obj1.show();
	}

}
