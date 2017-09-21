/*	Problem 9
 * 	Michael Coppeta
 * 	Determines the area of a trapezoid based on information given by user
 */

import java.util.Scanner; //imports Scanner class

//This program calculates the area of a trapezoid
public class Problem9 {
	
	public static void main(String[] args){
		System.out.println("Area of a Trapezoid Calculator"); //prints purpose of program
		
		Scanner input = new Scanner(System.in); //instantiates scanner named input
		
		System.out.print("Enter the height of the trapezoid: "); //prompt user for height
		double height = input.nextDouble(); //sets height as a double
		
		System.out.print("Enter the length of the bottom base: "); //prompt user for length
		double bottomLength = input.nextDouble(); //sets the length as a double
		
		System.out.print("Enter the length of the top base: "); //prompt user for length 
		double topLength = input.nextDouble(); //sets the legnth as a double
		
		double lengthSum = topLength + bottomLength; //half of calculation
		double area = 0.5*lengthSum*height; //calculate area
		System.out.println("The area is: " + area); //output the area
		
		input.close(); //close scanner
		
	}
}
