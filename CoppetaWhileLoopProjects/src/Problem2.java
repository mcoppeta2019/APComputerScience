/*
 * 	Project 2 (4-6, page 147)
 * 	Michael Coppeta
 * 
 * 	This program predicts population growth based on input
 */

import java.util.Scanner; //instantiates the scanner

public class Problem2 {

	public static void main(String[] args){
		//Declares variables to hold conditions of the population
		int initialOrganisms, growthRate, hoursForRate, hours;
		
		Scanner input = new Scanner(System.in); //instantiates the scanner
		
		//prompt user for initial organisms 
		System.out.print("Enter the initial number of organisms: ");
		initialOrganisms = input.nextInt();
		
		//prompt user for growth rate
		System.out.print("Enter the growth rate: ");
		growthRate = input.nextInt();
		
		//prompt user for the hours needed to achieve the growth
		System.out.print("Enter the hours needed to achieve the growth: ");
		hoursForRate = input.nextInt();
		
		//prompt user for the hours 
		System.out.print("Enter the number of hours in which the population grew: ");
		hours = input.nextInt();
		
		input.close(); //closes the scanner
		
		while (hours >= hoursForRate){ //while the growth rate can still be achieved
			initialOrganisms *= growthRate; //adds the growth rate to the intiial amount of organisms
			hours -= hoursForRate; //subtracts the hours for the growth rate from the hours entered
		}
		
		//prints the predicted population to the user
		System.out.println("\nThe total population is: " + initialOrganisms);
	}
}
