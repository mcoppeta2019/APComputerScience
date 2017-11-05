/*
 * 	Problem 4
 * 	Michael Coppeta
 * 
 * 	This program determines if the first occurrence of the character 'a' in a
 * 	user inputed strings is immediately followed by another 'a'
 */

import java.util.Scanner; //imports scanner class

public class Problem4 {
	
	//main method gets user input and prints the return value of the doubleA method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text; //declares variable to hold user input
		
		//get user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores in variable text
		
		input.close(); //closes scanner
		
		//calls doubleA method, uses text as parameter, and prints the result
		System.out.println(doubleA(text));
	}
	
	//this method takes a string as a parameter and returns whether the first 'a' is followed by another
	public static boolean doubleA(String text){
		
		//if there is an 'a' in the string, and if there is another character after the 'a'
		if ((text.indexOf("a") != -1) && (text.length() > text.indexOf("a") + 1)){ 
		
			//returns true if character after first 'a' is another 'a', false if not
			return (text.charAt(text.indexOf("a") + 1) == 'a'); 
			
		} else {
			
			//if there are no 'a's or there is not another character after the first 'a'
			return false;
		}
	}
}
