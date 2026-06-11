package accessmodifiers;
public class Access1 {
	public void display1() {
		System.out.println("Output from public method.");
	}
	
	protected void display2() {
		System.out.println("Output from protected method.");
	}
	
	private void display3() {
		System.out.println("Output from private method.");
	}
	
	void display4() {
		System.out.println("Output from default method.");
	}
	
	public static void main(String[] args) {
		Access1 obj1=new Access1();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();
	}

}
