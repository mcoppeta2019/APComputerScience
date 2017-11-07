/*
 * 	Problem 3
 * 	Michael Coppeta
 * 
 * 	Takes a string and index as input, then prints 3 characters starting at the given index 
 */

import java.util.Scanner; //imports Scanner class

public class Problem3 {
	
	//main method gets user input, then calls method to return a 3-character long string
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String text = ""; //declares variable to hold string, the user input
		int index; //declares variable to hold index, the user input
		
		//gets user input - loops prompt until input is valid
		while (text.length() < 3){
			System.out.print("Please enter a string: "); //prompts user for text input
			text = input.nextLine(); //stores in text variable
		}
		
		System.out.print("Please enter an index: "); //prompts user for integer input
		index = input.nextInt(); //stores in index variable
		
		input.close(); //closes the scanner
		
		//prints out the three character string returned by threeChars method
		System.out.println(threeChars(text, index));
	}
	
	//this method returns a 3-character string from text (parameter )starting at index (parameter) 
	//returns the first three letters if index is too big or too small
	public static String threeChars(String text, int index){
		
		//determines what to return
		if (text.length() >= 3){ //if the length of text is at least 3
			
			//if index is less than 0 and greater than or equal to the third to rightmost character
			if ((index <= text.length() - 3) && (index > 0)){ 
				
				return text.substring(index, index+3); //returns string of 3 characters starting at index
				
			} else { //if the index is too big or small
				
				return text.substring(0,3); //returns 3 character string starting at first character
				
			}
			
		} else { //if length of text is less than 3
			
			return text; //returns text if it does not contain at least 3 characters
			
		}
	}
}
