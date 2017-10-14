/*
 * 	Problem 4
 * 	Michael Coppeta
 * 	This program creates a guessing game that provides feedback until the correct answer is guessed
 */

import java.util.Scanner; //imports the scanner class

public class Problem4 {
	
	public static void main(String[] args){
		//creates a variable to count the number of guesses, the last guess, and the secret number
		int guessCount = 0, guess=-1; //guess = -1, so it enters the loop, but can never equal the secret number
		int secretNumber = getRandInt(0,100); 
		
		Scanner input = new Scanner(System.in); //instantiates the scanner
		
		//lets the user what what's happening
		System.out.println("Guess the secret number between 0 and 100!\n");
		
		while (guess != secretNumber){
			
			System.out.print("Guess: "); //prompts user to guess the number
			guess = input.nextInt(); //stores user's guess in variable
			
			//gives feedback about guess: if it's too high or low
			if(guess<secretNumber) System.out.println("Your guess was too low!\n");
			if(guess>secretNumber) System.out.println("Your guess was too high!\n");
			
			guessCount++; //increases the count of guesses
		}
		
		input.close(); //closes the scanner
		
		//Once the program reaches this point, the player must have guessed the correct number
		System.out.println("\nCorrect! The game is now finished!\n");
		System.out.println("The secret number was " + secretNumber);
		System.out.println("It took you " + guessCount + " guess(es) to choose it!");
	}
	
	//method to return a "random" number between the two parameters
	public static int getRandInt(int min, int max){
		
		return (int)(Math.random()*((max - min) + 1)) + min; //returns the "random" int
	
	}
}
