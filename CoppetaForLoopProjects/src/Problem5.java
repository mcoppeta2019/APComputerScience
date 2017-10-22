/*
 * 	Problem 5
 * 	Michael Coppeta
 * 
 * 	This program prints a rectangle of O's and +'s of user defined dimensions
 */

import java.util.Scanner; //imports the scanner class

public class Problem5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //instantiates the scanner
		int width, height; //declares variables to hold rectangle dimensions
		
		//prompt user for width input
		System.out.print("Enter a width: ");
		width = input.nextInt(); //stores in width variable
		
		//prompt user for height input
		System.out.print("Enter a height: ");
		height = input.nextInt(); //stores in height variable
		
		input.close(); //closes scanner
		
		//calls method to print the rectangle
		printRectangle(width, height);
	}
	
	//method to print the rectangle of user defined dimensions
	public static void printRectangle(int width, int height){
		//ASSUMPTION as to pattern:
		//	+ are odd places, O are even places, not a repeating O+ pattern
		
		System.out.println(); //prints blank line between input and output
		
		for (int i = 1; i <= height; i++){ //outer loop prints each individual row
			
			for (int j = 1; j <= width; j++){ //inner loop prints each individual digit per row
				
				if (i%2!=0){ //if it is an odd row
					
					if (j%2==0) System.out.print("O"); //prints O on each even place
					else System.out.print("+"); //prints + on each odd place
					
				} else { //if it is an even row
					
					if (j%2==0) System.out.print("+"); //prints + on each even place
					else System.out.print("O"); //prints O on each odd place
				}
				
			}
			
			System.out.println(); //moves on to the next line
		}
	}
}
