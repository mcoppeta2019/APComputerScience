/*
 * 	Problem 2
 * 	Michael Coppeta
 * 
 * 	A grade calculation program, it prints the average of a user defined number of grades
 */

import java.util.Scanner; //imports scanner class

public class Problem2 {
	public static void main(String[] args){
		int numGrades, average; //creates integer variable to hold number of grades and average
		double gradeSum = 0; //creates variable to hold the sum of the grades
		Scanner input = new Scanner(System.in); //instantiates the scanner
		
		//prompts user to input number of grades
		System.out.print("How many grades would you like to enter? ");
		numGrades = input.nextInt(); //stores input in numGrades
		
		for (int i = 1; i<=numGrades; i++){ //asks user for each grade, adds to sum
			//prompt user for specific grade
			System.out.print("Enter grade #" + i + ": ");
			gradeSum += input.nextDouble(); //adds input to gradeSum variable
		}
		
		//calculates the average: sum of grades / # grades
		average = (int) Math.round(gradeSum / numGrades); //rounds the average to the nearest integer
		
		//outputs the average to the user
		System.out.println("Your class average is: " + average);
		
		input.close(); //closes the scanner
	}
}
