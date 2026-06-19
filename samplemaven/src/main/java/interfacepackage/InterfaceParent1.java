package interfacepackage;

public interface InterfaceParent1 {
	public void display();
	public static void test1() {
		System.out.println("test1-static method defined in interface");
	}
	default void test2() {
		System.out.println("test2-default method defined in interface");
	}
}
