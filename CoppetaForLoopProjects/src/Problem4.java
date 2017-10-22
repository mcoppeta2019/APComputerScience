/*
 * 	Problem 4
 * 	Michael Coppeta
 * 
 * 	Prints another triangle of user definied size, except it is right justified
 *	NOTE: The input is expected to be an integer less than 10
 */

import java.util.Scanner; //imports the Scanner class

public class Problem4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int size; //declares variable to hold size (rows) of triangle
		
		//prompts user to input size
		System.out.print("Enter a size: ");
		size = input.nextInt(); //stores in size variable
		
		input.close(); //closes the scanner
		
		//calls method to print triangle
		triangleLeft(size);
	}
	
	//creates method to prints a right justified triangle. Parameter indicates number of rows
	public static void triangleLeft(int rows){
		System.out.println(); //prints blank line between input and output
		
		for (int i = 1; i <= rows; i++){ //outer loop prints each individual row
			
			for (int j = 1; j <= (rows - i); j++) { //first inner loop prints the spaces for the row
				
				System.out.print(" "); //prints a space
			}
			
			for (int j = 1; j <= i; j++){ //second inner loop prints the individual digits of the row
				
				System.out.print(i); //prints the digit
			}
			
			System.out.println(); //moves to next line
		}
	}
}
