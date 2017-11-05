/*
 * 	Problem 9
 * 	Michael Coppeta
 * 
 * 	This program takes user input, then prints the input without asterisks and 
 * 	the characters immediately next to the asterisks
 */

import java.util.Scanner; //imports the scanner class

public class Problem9 {

	//main method takes user input and calls starOut method and prints the return value
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold the user input
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores input in text variable
		
		input.close(); //closes the scanner
		
		//calls the starOut method, with text as a parameter, and prints the return value
		System.out.println(starOut(text));
	}
	
	//this method returns a string that doesn't have the asterisks of the parameter or their neighboring chars
	public static String starOut(String text){
		String returnString = ""; //creates variable to hold string to return
		
		//while there is still an asterisk in the text variable, it'll loop and remove characters
		while (text.indexOf("*") != -1){
			
			//adds text to keep to returnString, if needed
			if (text.charAt(0) != '*'){ //if first char is *, do not add anything
				
				//adds the the beginning of text, until the asterisk-1 index (part to keep)
				returnString += text.substring(0, text.indexOf("*") - 1); 
				
			}
			
			//removes the correct amount of text
			//if char after * is another *, don't remove it. if there is no char after *, don't do anything
			if ((text.length() > text.indexOf("*") + 1) && (text.charAt(text.indexOf("*") + 1) == '*')){ 
				
				text = text.substring(text.indexOf("*") + 1, text.length()); //keeps the second asterisk
				
			} else if (text.length() > text.indexOf("*") + 1){ //if * doesn't precede a second *
				
				text = text.substring(text.indexOf("*") + 2, text.length()); //does not keep char after *
				
			} else { //there is no char after asterisk
				
				text = ""; //there is nothing left in the string
				
			}
		}
		
		//adds anything thats left of text variable to returnText variabe (all asterisks are gone)
		returnString += text;
		
		//returns the new string without the asterisks and their neighboring characters
		return returnString;
	}
}
