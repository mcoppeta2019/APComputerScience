//	Bank Account
//	Michael Coppeta
//	The class at the top of the bank account hierarchy

public class BankAccount {
	
	//Static Variable
	private static int idCounter = 0; //counter so each new bank account gets an incremented id
	
	//Instance Variables
	
	private double balance; //amount of money in account
	private int id; //identification number
	
	//Constructor
	public BankAccount(double newBalance) {
		balance = newBalance;
		id = idCounter;
		idCounter++;
	}
	
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
	
	//Accessors and Mutators
	
	//mutator for balance 
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	//accessor for balance - identical to viewBalance()
	public double getBalance() {
		return balance;
	}
	
	//mutator for id
	public void setID(int newID) {
		id = newID;
	}
	
	//accessor for id
	public int getID() {
		return id;
	}
	
}
