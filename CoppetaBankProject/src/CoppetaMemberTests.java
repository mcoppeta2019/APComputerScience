/*
 * 	Coppeta Member Tests
 * 	Michael Coppeta
 * 	
 * 	Tests the Member class
 */

public class CoppetaMemberTests {

	//tests the Member class
	public static void main(String[] args){
		BankAccount timChecking = new BankAccount(4000, 0.05);
		BankAccount timSavings = new BankAccount(16000, 0.25);
		
		Member mikeCoppeta = new Member("Mike", "Coppeta"); //only name case
		Member timWalker = new Member("Tim", "Walker", timChecking, timSavings); //all args case
		
		//tests constructors and toString
		System.out.println("Member Class\n\nConstructor and toString tests\n\n" + 
							mikeCoppeta + "\n" + timWalker + "\n\n");
		
		timWalker.manage();
	}
}
