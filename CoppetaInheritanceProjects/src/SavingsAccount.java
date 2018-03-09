//	Savings Account
//	Michael Coppeta
//	A subclass of BankAccount, a specific account type

public class SavingsAccount extends BankAccount {
	
	//Instance Variables
	double interestRate;

	//Constructor - takes interestRate in form 0.xx = xx%
	public SavingsAccount(double newBalance, int newID, double newInterestRate) {
		super(newBalance, newID);
		interestRate = newInterestRate;
	}
	
	//Behaviors
	
	//addInterest method adds the percentage of balance to the balance
	public void addInterest() {
		deposit(viewBalance() * interestRate);
	}
	
}
