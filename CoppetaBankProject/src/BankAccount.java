/*
 * 	Bank Account
 * 	Michael Coppeta
 * 	
 * 	This class represents a basic bank account
 */

public class BankAccount {
	
	//INSTANCE VARIABLES
	private double balance, interestRate;
	
	//CONSTRUCTORS
	
	//default constructor, balance = 0.0, interestRate = 0.06
	public BankAccount(){
		this(0.0, 0.06);
	}
	
	//balance given, interestRate = 0.06
	public BankAccount(double newBalance){
		this(newBalance, 0.06);
	}
	
	//balance given, interestRate given
	public BankAccount(double newBalance, double newInterestRate){
		balance = newBalance;
		interestRate = newInterestRate;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for balance
	public double getBalance(){
		return balance;
	}
	
	//mutator for balance
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	//accessor for interestRate
	public double getInterestRate(){
		return interestRate;
	}
	
	//mutator for interestRate
	public void setInterestRate(double newInterestRate){
		interestRate = newInterestRate;
	}
	
	//BEHAVIORS
	
	//deposit method, adds to balance
	public void deposit(double newDeposit){
		balance += newDeposit;
	}
	
	//addInterest method, increases balance by (balance * interestRate)
	public void addInterest(){
		balance += (balance * (interestRate/100));
	}
	
	//withdraw method, reduces balance. Returns true if successful, 
	//	returns false with a message if not successful  
	public boolean withdraw(double newWithdrawal){
		
		//checks if there is enough money to make withdrawal
		if (balance >= newWithdrawal){ //if there is, subtract from balance, return true
			balance -= newWithdrawal;
			return true;
		} else { //if there isn't, print message, return false
			System.out.println("Insufficient Funds.");
			return false;
		}
	}
	
	//toString method, returns info about the bank account
	public String toString(){
		//makes sure there are no more than 2 decimal places
		//it will print a rounded value, but won't change the original balance
		double newBalance = balance * 100;
		newBalance = (double) Math.round(newBalance);
		newBalance /= 100;
		
		return ("{balance: $" + newBalance + ", interest rate: " + interestRate + "%}");
	}
	
	
}
