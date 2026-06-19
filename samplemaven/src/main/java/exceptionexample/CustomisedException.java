package exceptionexample;

public class CustomisedException {

	public static void main(String[] args) throws VoteEligibilityException {
		int age=15;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new VoteEligibilityException("Not eligible for voting");
		}
	}

}
