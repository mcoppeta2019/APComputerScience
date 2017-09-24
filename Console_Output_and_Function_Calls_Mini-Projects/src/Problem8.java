/*
 * 	Problem 8
 * 	Michael Coppeta	
 * 	This program takes in radius, to output diameter of a sphere
 */

import java.util.Scanner; //imports Scanner

public class Problem8 {
	//this method takes in the radius, then outputs several values of a sphere
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in); //instantiates scanner
		
		System.out.print("Enter the sphere's radius: "); //prompts user for input
		double radius = input.nextDouble(); //sets radius equal to the user's input
		
		input.close(); //closes scanner
		
		//diameter is double the radius
		double diameter = 2.0*radius; //sets diameter equal to 2*radius
		
		//circumference is pi * diameter, or 2*pi*radius
		double circumference = diameter * 3.14159265; //Math.PI works too
		
		//surface area = 4*pi*radius^2
		double surfaceArea = 4.0*3.14159265*(radius*radius);
		
		//volume = (4/3) * pi * radius^3
		double volume = (4.0/3.0) * 3.14159265 * (radius*radius*radius);
		
		//prints the diameter, circumference, surface area, and volume
		System.out.println("\nThe diameter is: " + diameter); //diameter
		System.out.println("The circumference is " + circumference); //circumference
		System.out.println("The surface area is: " + surfaceArea); //surface area
		System.out.println("The volume is: " + volume); //volume
		
		
	}
}
