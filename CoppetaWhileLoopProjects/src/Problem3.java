/*
 * 	Problem 3 (4-7, page 147)
 * 	Michael Coppeta
 * 
 * 	Until the input is -1, this program will return 2 to the power of the user's input
 * 	NOTE: This program expects positive integers as input, aside from -1 to end it
 */

import java.util.Scanner; //imports the scanner class

public class Problem3 {

		public static void main(String[] args){
			int powerInput=0; //creates a variable to hold the inputed power
			
			Scanner input = new Scanner(System.in); //instantiates the scanner
			
			//prompts user for first power
			//this first one must be outside loop, because if -1 is entered, it should not print 2^-1
			System.out.print("Enter the power (enter -1 to end program): ");
			powerInput = input.nextInt(); //stores input in a variable
			
			while (powerInput != -1){ //when the user enters -1, it does not display 2^-1; it exits the loop
				//displays 2^powerInput to the user
				//displays a double, because 2^(a negative number) is between 0 and 1
				System.out.println("2 to the power of " + powerInput + " is: " + Math.pow(2, powerInput) + "\n");
				
				//prompt user to input another power
				System.out.print("Enter the power (enter -1 to end program): ");
				powerInput = input.nextInt(); //stores input in a variable
			}
			
			input.close(); //closes the scanner
			
		}
}
