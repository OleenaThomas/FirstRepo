package reviewjavatwo;

public class PrintVariables {

	public void display(String name, int age) {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
	
	public static void main(String[] args) {
		PrintVariables obj=new PrintVariables();
		obj.display("John", 25);
	}
}
