package reviewjavatwo;

public class SampleInheritanceChild extends SampleInheritanceParent {
	String grade;
	
	public SampleInheritanceChild(String grade) {
		super("John", 25);
		this.grade=grade;
	}
	
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Grade: " +grade);
		print();
	}
	public static void main(String[] args) {
		SampleInheritanceChild obj=new SampleInheritanceChild("A Plus");
		obj.display();
	}

}
