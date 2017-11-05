/*
 * 	Problem 1
 * 	Michael Coppeta
 * 
 * 	This program takes user input, then returns whether it contains "@cchs" or not
 */

import java.util.Scanner; //imports the Scanner class

public class Problem1 {
	
	//main method, takes user input and calls containsAt function
	public static void main(String[] args){
		String text; //creates variable to hold the user input
		Scanner input = new Scanner(System.in); //instantiates a scanner
		
		//gets user input
		System.out.print("Please enter a string: "); //prompts user for input
		text = input.nextLine(); //stores input in text variable
		
		input.close(); //closes scanner
		
		//prints whether or not the text contains "@cchs"
		System.out.println(containsAt(text)); //calls containsAt method to determine
	}
	
	//containsAt method takes String as parameter, returns true if it contains "@cchs"
	public static boolean containsAt(String text){
		
		//text.indexOf() will return the first time "@cchs" occurs, it it is -1 it returns false
		//if it's greater than or equal to zero, meaning it occurs withint the text, it returns true
		
		if (text.indexOf("@cchs") >= 0){ //place of "@cchs"
			return true; //anywhere in text, returns true
		} else {
			return false; //-1, nowhere in text, returns false
		}
	}
}
