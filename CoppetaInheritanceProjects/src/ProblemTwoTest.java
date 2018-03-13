//	Problem Two Test
//	Michael Coppeta
//	This tests the AccountHoldings class

import java.util.*; //imports necessary Lists

public class ProblemTwoTest {

	//main method for testing AccountHoldings
	public static void main(String[] args) {
		
		//instantiates five accounts, 2 checking and 3 savings
		CheckingAccount checking1 = new CheckingAccount(1000, 100);
		CheckingAccount checking2 = new CheckingAccount(4000, 200);
		SavingsAccount savings1 = new SavingsAccount(10000, 0.08);
		SavingsAccount savings2 = new SavingsAccount(40000, 0.16);
		SavingsAccount savings3 = new SavingsAccount(160000, 0.1);
		
		//creates an ArrayList to pass to the AccountHoldings
		ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
		acc.add(checking1); acc.add(checking2); //adds all the accounts
		acc.add(savings1); acc.add(savings2);
		acc.add(savings3);
		
		//instantiates an AccountHoldings object named accounts, passed list of type BankAccount
		AccountHoldings accounts = new AccountHoldings(acc);
		
		//tests the totalBalance method
		System.out.println(accounts.totalBalance()); //215000
		
		//creates another checking account and adds it to accounts
		CheckingAccount checking3 = new CheckingAccount(85000, 10);
		accounts.addAccount(checking3);
		
		//checks updated totalBalance
		System.out.println(accounts.totalBalance()); //300000
		
		//These lines call the instance methods unique to each account
		checking1.removeAnnualFee(); //900 +
		checking2.removeAnnualFee(); //3800 +
		checking3.removeAnnualFee(); //84990 +
		savings1.addInterest(); //10800 +
		savings2.addInterest(); //46400 +
		savings3.addInterest(); //176000 = 322890
		
		System.out.println(accounts.totalBalance()); //322890.0
		
	}
}
