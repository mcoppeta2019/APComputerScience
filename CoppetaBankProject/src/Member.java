/*
 *	Member
 *	Michael Coppeta
 *
 *	This class models a member of a bank
 */

import java.util.Scanner; //imports the Scanner class

public class Member {

	//INSTANCE VARIABLES
	private String firstName, lastName;
	private BankAccount checking, savings;
	
	//CONSTRUCTORS
	
	//accepts firstName and lastName
	public Member(String newFirstName, String newLastName){
		this(newFirstName, newLastName, new BankAccount(), new BankAccount());
	}
	
	//accepts all arguments
	public Member(String newFirstName, String newLastName, BankAccount newChecking, BankAccount newSavings){
		firstName = newFirstName;
		lastName = newLastName;
		checking = newChecking;
		savings = newSavings;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for firstName
	public String getFirstName(){
		return firstName;
	}
	
	//mutator for firstName
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	
	//accessor for lastName
	public String getLastName(){
		return lastName;
	}
	
	//mutator for lastName
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	
	//accessor for checking 
	public BankAccount getChecking(){
		return checking;
	}
	
	//mutator for checking
	public void setChecking(BankAccount newChecking){
		checking = newChecking;
	}
	
	//accessor for savings
	public BankAccount getSavings(){
		return savings;
	}
	
	//mutator for savings
	public void setSavings(BankAccount newSavings){
		savings = newSavings;
	}
	
	//BEHAVIORS
	
	//toString method, returns info about the member
	public String toString(){
		return ( "{name: " + firstName + " " + lastName + ", checking account: " +
				checking + ", savings account: " + savings + "}");
	}
	
	//manage method, creates a loop of menus and options for the user
	public void manage(){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int currentChoice = -1;
		int currentAccount = -1;
		double toDeposit, toWithdraw;
		
		//prompts user with welcome message
		System.out.println("Welcome to Account Management, " + firstName + " " + lastName + "!");
		
		//this is the main loop of choices
		do {
			//prompt user with options
			System.out.println(	"1. Manage Checking Account\n" + 
								"2. Manage Savings Account\n" +
								"3. Exit");
			
			currentAccount = input.nextInt(); //gets user input
			
			//if an account management was chosen
			if (currentAccount == 1 || currentAccount == 2){
			
				//displays corresponding welcome message
				if (currentAccount == 1){ //if Checking
					System.out.println("You are now managing your Checking Account.");
				} else if (currentAccount == 2){ //if Savings
					System.out.println("You are now managing your Savings Account.");
				}
			
				do {
					
					//display options
					System.out.println("1. Deposit \n2. Withdraw \n3. Add Interest \n4. Back");
					
					currentChoice = input.nextInt(); //gets input
					
					if (currentChoice == 1){ //user wants to deposit
						System.out.print("How much would you like to deposit? "); //prompt for input
						toDeposit = input.nextDouble(); //stores input in variable
						
						//deposits the entered amount to the correct account
						if (currentAccount == 1){
							checking.deposit(toDeposit);
						} else if (currentAccount == 2){
							savings.deposit(toDeposit);
						}
					}
					
					else if (currentChoice == 2){ //user wants to withdraw
						System.out.print("How much would you like to withdraw? "); //prompt for input
						toWithdraw = input.nextDouble(); //stores input in variable
						
						//withdraws from correct account
						if (currentAccount == 1){ //checking account
							if (checking.withdraw(toWithdraw)){ //if withdrawal is successful
								
								//tells the message it was successful, and prints new balance
								System.out.println("Withdrawal Successful! Your checking account now contains $" + 
													checking.getBalance() + ".");
							} else { //if withdrawal is unsuccessful 
								System.out.println("Withdrawal Failed.");
							}
						} 
						else if (currentAccount == 2){ //savings account
							if (savings.withdraw(toWithdraw)){ //if withdrawal is successful
								
								//tells the message it was successful, and prints new balance
								System.out.println("Withdrawal Successful! Your savings account now contains $" +
													savings.getBalance() + ".");
							} else { //if withdrawal is unsuccessful
								System.out.println("Withdrawal Failed");
							}
						}
					}
					
					else if (currentChoice == 3){ //user wants to add interest
						
						//adds to correct account
						if (currentAccount == 1){ //checking account
							checking.addInterest(); //adds interest
							
							System.out.println("Your checking account now contains $" + 
												checking.getBalance() + "."); //prints new balance
						
						} else if (currentAccount == 2){ //savings account
							savings.addInterest(); //adds interest
							
							System.out.println("Your savings account now contains $" + 
												savings.getBalance() + "."); //prints new balance
						}
					}
					
				} while (currentChoice != 4); //if choice is 4, return to old loop
			}
			
		} while (currentAccount != 3); //if choice is 3, exit loop
		
		input.close(); //closes the scanner
		
		System.out.println("Goodbye!"); //sends an exit message to user
	}
}
