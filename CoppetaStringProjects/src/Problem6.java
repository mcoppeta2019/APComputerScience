/*
 * 	Problem 6
 * 	Michael Coppeta
 * 
 * 	This program takes user input, then prints the input except it builds up to it
 * 	example: "Java" --> "JJaJavJava"
 */

import java.util.Scanner; //imports the scanner class

public class Problem6 {

	//main method gets user input, then prints the return value of stringBuildup method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold user input
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores input in text variable
		
		input.close(); //closes the scanner
		
		//calls stringBuildup method, with text variable as parameter, and prints the return value
		System.out.println(stringBuildup(text));
	}
	
	//this method takes the String input, and returns a new string that builds up to the parameter 
	public static String stringBuildup(String text){
		String returnString = ""; //declares a new variable to hold the return string
		
		//loops through each character of text, prints the buildup up to that letter
		for(int i = 0; i < text.length(); i++){
			
			//prints each letter up to the current one in the outside for loop
			for(int j = 0; j <= i; j++){
				
				//adds the next character to the return string
				returnString += text.charAt(j);
			}
		}
		
		//returns the new string variable
		return returnString;
	}
}
