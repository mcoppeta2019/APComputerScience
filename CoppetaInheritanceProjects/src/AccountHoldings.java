//	Account Holdings
//	Michael Coppeta
//	This class represents the collections of all accounts at a bank

import java.util.*; //imports necessary Lists 

public class AccountHoldings {

	//Instance Variables
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>(); //holds accounts
	
	//Constructor
	public AccountHoldings(ArrayList<BankAccount> newAccounts) {
		accounts = newAccounts; //sets accounts to newAccounts parameter
	}
	
	//Behaviors
	
	//addAccount method adds a new BankAccount to accounts List
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}
	
	//totalBalance method calculates the sum of all the accounts' balances
	public double totalBalance() {
		double total = 0; //initializes variable to hold the sum of the balances
		
		//loops through each account
		for(BankAccount account : accounts) {
			total += account.viewBalance(); //adds the account's balance to total
		}
		
		return total; //returns sum
	}
	
	
}
