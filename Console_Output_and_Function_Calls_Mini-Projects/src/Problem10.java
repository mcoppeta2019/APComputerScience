/*
 * 	Problem 10
 * 	Michael Coppeta
 * 	This program prints the expected weight determined from the height and gender inputed
 */

/* 
 * IMPORTANT NOTE: the prompt for this question is designed 
 * so that any height under or equal to 5 feet has the same weight 
 */

import java.util.Scanner; //imports Scanner class

public class Problem10 {
	public static void main(String[] args){
		int increment = 0; //initialize four variables for later use
		int initial = 0;
		String gender = "";
		double height = 0;
		
		Scanner input = new Scanner(System.in); //instantiates the Scanner, named input
		
		boolean valid = false; //used for determining if a piece of input is valid
		
		while(!valid){ //repeats this question until a valid response is given
			System.out.print("Enter your gender (man or woman): "); //prompt user for gender
			gender = input.nextLine(); //sets String gender equal to the gender inputed
		
			if(gender.equals("man")) valid=true; //checks if gender ="man" (valid)
			else if(gender.equals("woman")) valid=true; //checks if gender ="woman" (valid)
			else{ //if the gender is not valid: inform the user, then ask again
				valid=false;
				System.out.println("\nGENDER MUST BE \"man\" OR \"woman\"\n");}
			}
		
		valid=false; //resets valid to false
		
		while(!valid){ //repeats this question until a valid response is given
			System.out.print("Enter your height in inches: "); //prompt user for height
			height = input.nextDouble(); //sets double height equal to the height inputed
			
			if(height>0) valid=true; //checks if height is greater than zero (valid)
			else{ //if height is less than zero (invalid) inform the user and ask again
				valid=false;
				System.out.println("\nTHE HEIGHT MUST BE GREATER THAN ZERO\n");
			}
		}
		
		if(gender.equals("man")){  //If the gender is "man", it sets the minimum weight, and the weight increment per additional inch
			initial = 106; 
			increment = 7;
		} else if(gender.equals("woman")){ //If the gender is "woman", it sets the minimun weight, and the weight increment per additional inch
			initial = 100;
			increment = 6;
		}
		
		if(height<=60){ //If the height is 60 inches or less, the weight has only one option
			if(gender.equals("man")){ //prints weight for man less than or equal to 60 inches ( 5 ft )
				System.out.println("\nYour expected weight is: 106 lbs");
			} else{ //prints weight for woman less than or equal to 60 inches ( 5 ft )
				System.out.println("\nYour expected weight is: 100 lbs");
			}
		} else{ //If the height is greater than 60 inches, it calls a method to calculate the weight
			//outputs the weight
			System.out.println("\nYour expected weight is: " + calculateWeight(height, increment, initial) + " lbs");
		}
		
		input.close(); //closes scanner
	}
	
	//This method determines the weight
	public static double calculateWeight(double height, int increment, int initial){ 
		//takes - height, increment per inch by gender, and initial weight by gender - as args
		
		double weight; //initializes the return variable
		
		height -= 60; //subtracts 60 because the weight for a 60 inch person is equal to "initial"
		
		//calculates the additional weight by multiplying the leftover inches, by the increment per inch by gender
		double additionalWeight = height*increment; 
		
		weight = initial + additionalWeight; //adds the sum of the initial and the additional weight
		
		return weight; //returns the weight
	}
} 