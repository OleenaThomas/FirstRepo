package inheritance;

public class MultilevelChild extends MultilevelParent {
	public int addition(int a, int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		MultilevelChild obj1=new MultilevelChild();
		System.out.println(obj1.addition(20, 56));
		obj1.display();
		obj1.parentDisplay();
	}

}
