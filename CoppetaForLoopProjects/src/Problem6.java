/*
 * 	Problem 6 (Credit Card Check)
 * 	Michael Coppeta
 * 
 * 	This program checks an entered 8-digit credit card number to see if it is valid
 */

import java.util.Scanner; //imports the scanner class

public class Problem6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int cardNumber; //declares variable to hold card number
		boolean isValid; //declares variable to hold if it's valid or not
		
		//prompts user for credit card number
		//ASSUMES: number is 8 digits, no spaces, only integers
		System.out.print("Enter 8-Digit Credit Card Number: ");
		cardNumber = input.nextInt(); //stores in cardNumber variable
		
		input.close(); //closes Scanner
		
		//runs method to determine if card is valid or not
		isValid = checkCard(cardNumber);
		
		//prints to the user whether it's valid or not
		if (isValid) System.out.println("\nThis credit card number is valid."); //is valid
		else System.out.println("\nThis credit card number is not valid."); //is not valid
	}
	
	//this method verifies whether the card number (parameter) is valid, returns true or false
	public static boolean checkCard(int cardNumber){
		int sumEveryTwoFromRight = 0, sumEveryOther = 0, totalSum = 0; //declares variables to hold future sums
		int currentDigit, currentSubDigit; //declares variable to hold current digit for later
		
		for (int i = 1; i <= 8; i++){ //loops through each digit of number (right to left)
			
			currentDigit = cardNumber % 10; //Calculates the rightmost digit
			cardNumber /= 10; //removes the rightmost digit
			
			if (i % 2 == 0){ //every other digit from 2nd to last
				currentDigit *= 2; //doubles number
				
				for(int j = 1; j<=2; j++){ //adds the digits of the double of the current digit (max is two times, worst case it adds zeros)
					
					currentSubDigit = currentDigit % 10; //finds digit of number
					currentDigit /= 10; //removes digit
					
					sumEveryOther += currentSubDigit; //adds digit to sum
				}
			} 
			
			else sumEveryTwoFromRight += currentDigit; //if every other from last, add to sum
		}
		
		totalSum = sumEveryOther + sumEveryTwoFromRight; //total sum = sum of all other sums 
		
		if (totalSum % 10 == 0) return true; //if the last digit of the total sum is zero
		return false; //if its anything but zero
	}
}
