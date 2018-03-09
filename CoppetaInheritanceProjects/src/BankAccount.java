//	Bank Account
//	Michael Coppeta
//	The class at the top of the bank account hierarchy

public class BankAccount {
	
	//Constructor
	public BankAccount(double newBalance, int newID) {
		balance = newBalance;
		id = newID;
	}

	//Instance Variables
	
	private double balance; //amouont of money in account
	private int id; //identification number
	
	//Common Behaviors
	
	//deposit method adds money to balance
	public void deposit(double addition) {
		balance += addition; //adds parameter double to balance
	}
	
	//withdraw method removes money from balance
	public void withdraw(double subtraction) {
		balance -= subtraction; //removes parameter double from balance
	}
	
	//viewBalance method returns the current balance
	public double viewBalance() {
		return balance;
	}
	
}
