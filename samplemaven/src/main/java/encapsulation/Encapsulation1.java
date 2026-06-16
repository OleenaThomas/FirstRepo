package encapsulation;

public class Encapsulation1 {
	private String name;
	private int rollNo;
	
	// To display data
	public void getter() {
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	// To modify data
	public void setter(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
}
