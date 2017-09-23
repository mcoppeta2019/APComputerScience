/*
 * 	Problem 8
 * 	Michael Coppeta
 * 	This program converts the inputed Fahrenheit to Celsius
 */

import java.util.Scanner; //imports Scanner class

public class Problem8 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiate the Scanner named input
		
		System.out.print("Enter the temperature in Fahrenheit: "); //prompt user to input fahrenheit
		double fahrenheit = input.nextDouble(); //creates variable Fahrenheit and sets it to the number inputed
		
		input.close(); //close the Scanner
		
		double celsius = (fahrenheit - 32.0) * (5.0/9.0); //calculate celsius from fahrenheit
		
		System.out.println("\nThe temperature in Celsius is: " + celsius); //outputs the temperature in celsius
	}
}
