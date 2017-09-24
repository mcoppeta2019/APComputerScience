/*
 * 	Problem 10
 * 	Michael Coppeta
 * 	This program outputs the recommended weight per gender of inputed height
 */

import java.util.Scanner; //imports Scanner class

public class Problem10 {
	//this method takes in height, and outputs the recommended weight by gender
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		
		System.out.print("Please enter a height in inches: "); //prompts user to input height
		int height = input.nextInt(); //sets height variable to the inputed height
		
		input.close(); //closes scanner
		
		//creates variables for the initial weights of men and women
		int maleWeight = 106; //106 lbs for first five feet of males
		int femaleWeight = 100; //100 lbs for first five feet of females
		
		height -= 60; //subtracts the initial 5 feet, to get how many extra inches there are
		
		if(height>0){ //it will only add to the weight if there are additional integers. If the number is negative, this will avoid subtracting weight
			maleWeight += height * 7; //adds seven lbs per inch over 60 (5 ft) to the weight
			femaleWeight += height * 6; //adds six lbs per inch over 60 (5 ft) to the weight
			}
		
		//outputs the two weights, calculated for each gender
		System.out.println("\nRecommended Male Weight: " + maleWeight + " lbs");
		System.out.println("Recommended Female Weight: " + femaleWeight + " lbs");
		
	}
}
