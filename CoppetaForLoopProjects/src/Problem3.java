/*
 * 	Problem 3
 * 	Michael Coppeta
 * 
 * 	Prints a triangle of numbers of a user defined size (rows)
 */

import java.util.Scanner; //imports Scanner class

public class Problem3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int size; //creates variable to hold the size of the triangle (rows)
		
		//prompt user for input
		System.out.print("Enter a size: ");
		size = input.nextInt(); //stores in size variable
		
		input.close(); //closes scanner
		
		//calls method to prints triangle, size as parameter
		triangleLeft(size);
	}
	
	//method to print trianlge. Parameter specifies the number of rows
	public static void triangleLeft(int rows){
		System.out.println(); //prints a blank line between input and output
		
		//the outer for loop prints each individual row
		for (int i = 1; i <= rows; i++){
			
			//the inner for loop prints a specific number of digits depending on the current row
			for (int j = 1; j <= i; j++){
				
				System.out.print(i); //prints individual digit
			}
			
			System.out.println(); //moves to the next row
		}
		
	}
}
