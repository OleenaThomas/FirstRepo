package aggregation;

public class Dept {
	// Creating attributes
	String departmentName;
	Teacher teacher_ref;
	
	// Creating methods
	public Dept(String departmentName, Teacher teacher_ref) {
		this.departmentName=departmentName;
		this.teacher_ref=teacher_ref;
	}
	
	public void displayDepartment() {
		System.out.println(" Department Name: " +departmentName);
		teacher_ref.displayDetails();
	}
	
	
}

