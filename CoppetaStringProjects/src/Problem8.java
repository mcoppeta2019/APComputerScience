/*
 * 	Problem 8
 * 	Michael Coppeta
 * 
 * 	This program takes user input, and prints the input is reverse
 */

import java.util.Scanner; //imports the scanner

public class Problem8 {

	//main method gets user input, and calls printReverse method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold user input
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores input in text variable
		
		input.close(); //closes the scanner
		
		//calls method that prints the text in reverse order, takes text as a parameter
		printReverse(text);
	}
	
	//this method takes text as a parameter, reverses the string, and prints it
	public static void printReverse(String text){
		String printText = ""; //declares new variable for the text to be printed
		
		//loops through each character, last to first, and adds them to a new string
		for(int i = text.length() - 1; i >= 0; i--){
			
			//adds the current character of the loop to the printText variable
			printText += text.charAt(i);
		}
		
		//prints the reversed text 
		System.out.println(printText);
	}
}
