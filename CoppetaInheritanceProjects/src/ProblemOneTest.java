//	Problem One Test
//	Michael Coppeta
//	This tests the functionality of BankAccount and its two subclasses

public class ProblemOneTest {

	//main method for testing classes
	public static void main(String[] args) {
		
		//tests BankAccount
		BankAccount ba = new BankAccount(1000); //instantiates
		System.out.println("BankAccount:\nBalance: " + ba.viewBalance() + "\nID: " + ba.getID()); //1000 \n 0
		ba.withdraw(100); ba.deposit(200); //test withdraw and deposit, net is +100
		System.out.println(ba.viewBalance()); //1100.0
		ba.setBalance(50); ba.setID(20); //test mutators
		System.out.println(ba.getBalance() + " " + ba.getID()); //50.0 20  - tests accessors
		
		//tests CheckingAccount
		CheckingAccount ca = new CheckingAccount(100000, 50); //instantiates 
		System.out.println("\nCheckingAccount:\nBalance: " + ca.viewBalance() + "\nID: " + ca.getID()); //100000 \n 1
		ca.withdraw(1000); ca.deposit(1050); //tests deposit and withdraw, net is +50
		System.out.println(ca.viewBalance()); //100050.0
		ca.removeAnnualFee(); //unique method
		System.out.println(ca.viewBalance()); //100000.0
		ca.setBalance(5); ca.setID(5); //tests mutators
		System.out.println(ca.getBalance() + " " + ca.getID()); //5.0 5  - tests accessors
		
		//tests SavingsAccount
		SavingsAccount sa = new SavingsAccount(1000000, 0.10); //instantiates
		System.out.println("\nSavingsAccount\nBalance: " + sa.viewBalance() + "\nID: " + sa.getID()); //1000000 \n 2
		sa.withdraw(500000);sa.deposit(400000); //tests withdraw and deposit, net -100000
		System.out.println(sa.viewBalance()); //900000.0
		sa.addInterest(); //unique method
		System.out.println(sa.viewBalance()); //990000.0
		sa.setBalance(10); sa.setID(10); //test mutators
		System.out.println(sa.getBalance() + " " + sa.getID()); //10.0 10  - tests accessors
		
	}
}
