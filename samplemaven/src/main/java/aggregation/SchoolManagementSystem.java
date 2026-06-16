package aggregation;

public class SchoolManagementSystem {

	public static void main(String[] args) {
			Teacher t1=new Teacher(" John", 25, "Physics", 25000);
			Dept d1=new Dept(" Science Department",t1);
			d1.displayDepartment();
			
			Student s1=new Student(" Alice ", 25," A plus", 101);
			s1.displayDetails();
		}
}
