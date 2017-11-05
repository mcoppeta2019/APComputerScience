/*
 * 	Problem 5
 * 	Michael Coppeta
 * 
 * 	This program gets user input, and prints a string that has 
 * 	removed all occurrences of 'yak' from the input
 */

import java.util.Scanner; //imports Scanner class

public class Problem5 {

	//main method gets user input, and prints return value of noYak method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold user input
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores in text variable
		
		input.close(); //closes scanner
		
		//calls noYak method with text as parameter, prints return value
		System.out.println(noYak(text));
	}
	
	//this method removes all occurrences of "yak" from the parameter String and returns the new String
	public static String noYak(String text){
		
		//loops through each occurrences of "yak" and removes it
		while (text.indexOf("yak") != -1){ //while "yak is still in text variable
			
			//each time there is a "yak" in text, it sets text equal to the substring from the first character
			//to the first "yak", plus the first character after "yak" to the end of the string
			
			text = text.substring(0, text.indexOf("yak")) + text.substring(text.indexOf("yak") + 3, text.length());
			
		}
		
		return text; //returns the string without any occurrences of "yak"
	}
}
