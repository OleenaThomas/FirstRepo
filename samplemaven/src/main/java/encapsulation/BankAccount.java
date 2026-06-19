package encapsulation;

public class BankAccount {
	// Private variables- cannot be accessed directly outside class
	private String accountHolder;
	private double balance;
	
	// Constructor
	public BankAccount(String accountHolder, double balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	// Getter method
	public double getBalance() {
		return balance;
	}
	
	// Deposit method
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("$" +amount + " deposited successfully");
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	// Withdraw amount
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("$" +amount +" withdrawn successfully");
		}
	}
	
	// Display account details
	public void display() {
		System.out.println("Account Holder: " +accountHolder);
		System.out.println("Current Balance: " +balance);
	}
	
	public static void main(String[] args) {
		// Creating object
		BankAccount acc=new BankAccount("John", 25000);
		acc.display();
		
		// Deposit money
		acc.deposit(5000);
		
		// Withdraw money
		acc.withdraw(1000);
		
		// Check balance
		System.out.println("Available Balance: $" +acc.getBalance());
		
		// Trying invalid withdrawal
		acc.withdraw(35000);
	}
}
