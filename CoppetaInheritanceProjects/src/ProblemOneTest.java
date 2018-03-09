//	Problem One Test
//	Michael Coppeta
//	This tests the functionality of BankAccount and its two subclasses

public class ProblemOneTest {

	//main method for testing classes
	public static void main(String[] args) {
		
		//tests BankAccount
		BankAccount ba = new BankAccount(1000, 4);
		System.out.println("BankAccount:\n" + ba.viewBalance()); //1000
		ba.withdraw(100); ba.deposit(200);
		System.out.println(ba.viewBalance()); //1100
		
		//tests CheckingAccount
		CheckingAccount ca = new CheckingAccount(100000, 44, 50);
		System.out.println("\nCheckingAccount:\n" + ca.viewBalance()); //100000
		ca.withdraw(1000); ca.deposit(1050);
		System.out.println(ca.viewBalance()); //100050
		ca.removeAnnualFee();
		System.out.println(ca.viewBalance()); //100000
		
		//tests SavingsAccount
		SavingsAccount sa = new SavingsAccount(1000000, 444, .10);
		System.out.println("\nSavingsAccount\n" + sa.viewBalance()); //1000000
		sa.withdraw(500000);sa.deposit(400000);
		System.out.println(sa.viewBalance()); //900000
		sa.addInterest();
		System.out.println(sa.viewBalance()); //990000
		
	}
}
