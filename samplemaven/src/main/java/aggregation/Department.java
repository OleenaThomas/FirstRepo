package aggregation;

public class Department {
	String deptName;
	Employee emp_ref;
	
	Department(String deptName, Employee emp_ref ){
		this.deptName=deptName;
		this.emp_ref=emp_ref;
	}
	
	public void show() {
		System.out.println("Name: " +emp_ref.name + 
				" Age: " +emp_ref.age 
				+" Address: " +emp_ref.address 
				+" Department Name: " +deptName);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("John", 25, "ABC Ave");
		Department d1=new Department("IT", e1);
		d1.show();

	}

}
