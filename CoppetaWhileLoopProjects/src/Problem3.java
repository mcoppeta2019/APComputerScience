/*
 * 	Problem 3 (4-7, page 147)
 * 	Michael Coppeta
 * 
 * 	Until the input is -1, this program will return 2 to the power of the user's input
 */

import java.util.Scanner; //imports the scanner class

public class Problem3 {

		public static void main(String[] args){
			int powerInput=0; //creates a variable to hold the inputed power
			
			Scanner input = new Scanner(System.in); //instantiates the scanner
			
			while (powerInput != -1){ //when the user enters -1, it displays 2^-1, then exits loop
				//prompt user to input a power
				System.out.print("Enter the power (enter -1 to end program): ");
				powerInput = input.nextInt(); //stores input in a variable
				
				//displays 2^powerInput to the user
				//displays a double, because 2^(a negative number) is between 0 and 1
				System.out.println("2 to the power of " + powerInput + " is: " + Math.pow(2, powerInput) + "\n");
			}
			
			input.close(); //closes the scanner
			
		}
}
