/*
 * 	Problem 6
 * 	Michael Coppeta
 * 
 * 	This program takes a number as input, then outputs the Collatz sequence until it reaches 1
 */

import java.util.Scanner; //imports the Scanner class

public class Problem6 {
	
	public static void main(String[] args){
		int initialNumber; //declares variable to hold inputed number
		Scanner input = new Scanner(System.in); //instantiates the scanner
		
		//prompt user to enter initial number
		System.out.print("Starting number: ");
		initialNumber = input.nextInt(); //stores it in initialNumber
		
		input.close(); //closes the scanner
		
		System.out.print(initialNumber); //prints the first term of the sequence
		
		while (initialNumber != 1){ //while the number isn't equal to 1
			
			if (initialNumber%2==0) initialNumber /= 2; //if number is even, divide by 2
			else initialNumber = (initialNumber * 3) + 1; //if number is odd, n = 3n + 1
			
			System.out.print("\t" + initialNumber); //prints the next term of the sequence
		}
		
	}
}
