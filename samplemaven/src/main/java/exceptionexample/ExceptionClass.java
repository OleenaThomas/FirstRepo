package exceptionexample;

public class ExceptionClass {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException d) {
			// if exact exception is not known give Exception within catch()
			b=2;
			int c=a/b;
			System.out.println(c);
			System.out.println(d);
		}
		finally {
			System.out.println("Operation complete");
		}
		
	}

}
