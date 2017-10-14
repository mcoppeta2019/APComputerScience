/*
 * 	Problem 5
 * 	Michael Coppeta
 * 	This program rolls two dice until their sum is equal to the inputed number
 */

import java.util.Scanner; //imports the scanner class

public class Problem5 {

		public static void main(String[] args){
			int sum; //declares variable to hold desired sum
			int die1 = 0, die2 = 0; //declares variables to hold individual die rolls, initial values are impossible, guaranteeing the loop to run
			
			Scanner input = new Scanner(System.in);
			
			//prompts user to enter the desired sum
			System.out.print("Desired dice sum: ");
			sum = input.nextInt(); //stores it in sum variable
			
			input.close(); //closes the scanner
			
			//creates a while loop to roll the dice until the sum is reached
			while ((die1+die2) != sum){
				die1 = getRandInt(1,6); //sets die1 equal to random number 1-6
				die2 = getRandInt(1,6); //sets die2 equal to random number 1-6
				
				//prints the dice rolls and their sum
				System.out.println(die1 + " and " + die2 + " = " + (die1+die2));
			}
				
		}
		
		//generates and returns a "random" number between min and max
		public static int getRandInt(int min, int max){
			
			return (int)(Math.random() * ((max - min) + 1)) + min; //returns the "random" number
		}
}
