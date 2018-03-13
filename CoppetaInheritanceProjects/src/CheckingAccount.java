//	Checking Account
//	Michael Coppeta
//	A subclass of BankAccount, a specific account type

public class CheckingAccount extends BankAccount {
	
	//Instance Variables
	
	private double annualFee; //represents the annual fee of the account

	//Constructor
	public CheckingAccount(double newBalance, double newAnnualFee) {
		super(newBalance);
		annualFee = newAnnualFee;
	}
	
	//Behaviors
	
	//removeAnnualFee method charges annual fee
	public void removeAnnualFee() {
		withdraw(annualFee); //removes annualFee from balance
	}
	
}
