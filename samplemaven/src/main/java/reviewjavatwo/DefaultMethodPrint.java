package reviewjavatwo;

public class DefaultMethodPrint {
	String name;
	
	public DefaultMethodPrint(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("Name: " +name);
	}
	public static void main(String[] args) {
		DefaultMethodPrint obj=new DefaultMethodPrint("John");
		obj.display();
	}

}
