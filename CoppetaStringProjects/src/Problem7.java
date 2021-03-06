/*
 * 	Problem 7
 * 	Michael Coppeta
 * 
 * 	This program takes a name as user input, then print it in lastname, firstname format
 */

import java.util.Scanner; //imports the Scanner class

public class Problem7 {

	//main method gets user input, and calls processName method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String name; //declares variable to hold user input
		
		//gets user input
		System.out.print("Please enter your first and last name: "); //prompts user for input
		name = input.nextLine(); //stores input in name variable
		
		input.close(); //closes the scanner
		
		//prints part of the output
		System.out.print("Your name in reverse order is ");
		
		//calls processName method, sends name as parameter, the method prints the result
		processName(name);
	}
	
	//this method takes a name as a parameter, then prints the name in the lastname, firstname format
	//NOTE: This method prints only lastname, firstname. Not the prior output text
	public static void processName(String name){
		
		//stores first name in variable
		String firstname = name.substring(0, name.indexOf(" ")); //first name is the first char to the space
		
		//stores last name in variable
		String lastname = name.substring(name.indexOf(" ") + 1, name.length()); //last name is the text after the space
				
		//prints the names in the reverse order
		System.out.println(lastname + ", " + firstname + ".");
	}
}
