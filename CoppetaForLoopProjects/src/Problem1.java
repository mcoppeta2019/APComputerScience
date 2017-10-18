/*
 * 	Problem 1
 * 	Michael Coppeta
 * 
 * 	Prints the sum of the squares from 1 to a user-defined number
 */

import java.util.Scanner; //imports Scanner class

public class Problem1 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int n; //creates variable for user input
		
		//prompt user to enter n, the number to count the sums up to
		//This assumes the input will be a positive integer
		System.out.print("Enter a number: ");
		n = input.nextInt(); //stores answer in n
		
		input.close(); //closes the scanner
		
		//calls method to find sum, then prints out the sum
		System.out.println("\nThe sum of the squares up to " + n + " is: " + sumSquares(n));
	}
	
	//creates a method to print sum of integers from 1 to n
	public static int sumSquares(int num){
		int counter = 1; //creates a counter variable, starts at 1
		int sum = 0; //creates variable for sum, starts at 0
		
		for (; counter<=num; counter++){ //repeats inside until counter has exceeded n
			sum += counter*counter; //adds the sum of the counter to the sum variable
		}
		
		return sum; //returns the sum back to main method
	}
}
