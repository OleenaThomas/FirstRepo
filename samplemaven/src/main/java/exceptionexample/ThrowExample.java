package exceptionexample;

public class ThrowExample {

	public static void main(String[] args) {
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new ArithmeticException("Age under 18!");
		}
	}

}
