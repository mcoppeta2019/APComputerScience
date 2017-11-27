/*
 * 	Coppeta Bank Account Tests
 * 	Michael Coppeta
 * 
 * 	Tests the BankAccount class
 */

public class CoppetaBankAccountTests {
	
	//tests BankAccount class
	public static void main(String[] args){
		System.out.println("BankAccount Class:");
		
		BankAccount bankDefault = new BankAccount(); //tests constructors
		BankAccount bankOneArg = new BankAccount(66);
		BankAccount bankTwoArgs = new BankAccount(40, 0.05);
		
		//tests toString()
		System.out.println("\nConstructors and toString()\n\t" + bankDefault + "\n\t" + 
							bankOneArg + "\n\t" + bankTwoArgs);
		//should be:
		//	{balance: $0.0, interest rate: 0.06%}
		//  {balance: $66.0, interest rate: 0.06%}
		//  {balance: $40.0, interest rate: 0.05%}
		
		//tests accessors and mutators
		System.out.println("\nAccessors\n\t" + bankTwoArgs.getBalance() + 
							"\n\t" + bankTwoArgs.getInterestRate());
		//should be:
		//	40.0
		//	0.05
		
		//tests Mutators
		bankDefault.setBalance(64);
		bankDefault.setInterestRate(0.16);
		System.out.println("\nMutators\n\t" + bankDefault.getBalance() +
							"\n\t" + bankDefault.getInterestRate());
		//should be:
		//	64.0
		//  0.16
		
		//tests behaviors
		
		bankOneArg.deposit(200);  //should be: 266.0
		System.out.println("\nDeposit\n\t" + bankOneArg.getBalance());
		
		System.out.println("\nWithdraw\n\t" + bankOneArg.withdraw(40)); //true
		System.out.println("\t"+ bankOneArg.getBalance()); //226.0
		System.out.println("\t" + bankOneArg.withdraw(400)); //error, then false
		System.out.println("\t"+ bankOneArg.getBalance()); //226.0
		
		bankTwoArgs.addInterest(); //should be: 42.0
		System.out.println("\nAdd Interest\n\t" + bankTwoArgs.getBalance());
		
		bankDefault.setInterestRate(0.1);
		bankDefault.setBalance(100);
		System.out.println("\n"+bankDefault); //100, 0.1%
		bankDefault.addInterest();
		System.out.println(bankDefault); //100.1, 0.1%
	}
}
