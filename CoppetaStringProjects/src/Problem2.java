/*
 * 	Problem 2
 * 	Michael Coppeta
 * 	
 * 	This program takes user input, then returns a string that has removed the first and last characters
 */

import java.util.Scanner; //imports the Scanner class

public class Problem2 {
	
	//main method takes user input, then calls method to remove first and last characters
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold user input
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores user input in text variable
		
		input.close(); //closes the scanner
		
		//calls method to have String of text without first or last characters returned
		System.out.println(withoutEnds(text));
	}
	
	//method takes a String as a parameter, it removes the first and last characters and returns the new String
	public static String withoutEnds(String text){
		
		//returns a substring of text depending on the length of the string
		if (text.length() > 1){ //the string has at least two characters
			
			return text.substring(1, text.length() - 1); //returns substring without first or last char
			
		} else { // text.length() <= 1
			
			return ""; //returns an empty string if the text has 0 or 1 character in it
		
		}
	}
}
