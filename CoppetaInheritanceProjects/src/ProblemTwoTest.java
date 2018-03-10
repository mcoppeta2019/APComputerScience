//	Problem Two Test
//	Michael Coppeta
//	This tests the AccountHoldings class

import java.util.*; //imports necessary Lists

public class ProblemTwoTest {

	//main method for testing AccountHoldings
	public static void main(String[] args) {
		
		//instantiates five accounts, 2 checking and 3 savings
		CheckingAccount checking1 = new CheckingAccount(1000, 4, 100);
		CheckingAccount checking2 = new CheckingAccount(4000, 8, 200);
		SavingsAccount savings1 = new SavingsAccount(10000, 16, .08);
		SavingsAccount savings2 = new SavingsAccount(40000, 64, .16);
		SavingsAccount savings3 = new SavingsAccount(160000, 1024, .1);
		
		//creates an ArrayList to pass to the AccountHoldings
		ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
		acc.add(checking1); acc.add(checking2); //adds all the accounts
		acc.add(savings1); acc.add(savings2);
		acc.add(savings3);
		
		//instantiates an AccountHoldings object named accounts
		AccountHoldings accounts = new AccountHoldings(acc);
		
		//tests the totalBalance method
		System.out.println(accounts.totalBalance()); //215000
		
		//creates another checking account and adds it to accounts
		CheckingAccount checking3 = new CheckingAccount(85000, 512, 10);
		accounts.addAccount(checking3);
		
		//checks updated totalBalance
		System.out.println(accounts.totalBalance()); //300000
	}
}
