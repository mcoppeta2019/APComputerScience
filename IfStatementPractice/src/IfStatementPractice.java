/*
 * 	If Statement Practice
 * 	Michael Coppeta
 * 	10/2/17
 *  This program uses several methods using if statements for several different purposes
 */

public class IfStatementPractice {
	public static void main(String[] args){ 
		
	//uses example cases to print the larger int
	System.out.println("Largest Int of Two:");
	System.out.println(largestInt(5, 10));
	System.out.println(largestInt(5, -10));
	System.out.println(largestInt(15, 100));
	System.out.println(largestInt(26, 14));
	
	//uses example cases for quotient and remainder
	System.out.println("\nQuotient and Remainder:");
	System.out.println(findQuotientAndRemainder(10,2));
	System.out.println(findQuotientAndRemainder(25,4));
	System.out.println(findQuotientAndRemainder(100,9));
	System.out.println(findQuotientAndRemainder(5,3));
	
	//uses example cases for right triangle checker
	System.out.println("\nRight Triangle?");
	System.out.println(isRightTriangle(3,4,5));
	System.out.println(isRightTriangle(4,3,5));
	System.out.println(isRightTriangle(5,12,13));
	System.out.println(isRightTriangle(4,3,6));
	System.out.println(isRightTriangle(6,6,6));
	System.out.println(isRightTriangle(5,4,3));
	
	//uses example cases for phone call method
	System.out.println("\nPhone Call Cost");
	System.out.println(phoneCallCost(2));
	System.out.println(phoneCallCost(1));
	System.out.println(phoneCallCost(10));
	System.out.println(phoneCallCost(20));
	System.out.println(phoneCallCost(9));
	}
	
	//determines which is larger and returns it
	public static int largestInt(int num1, int num2){
		if (num1>=num2) { //if num1 is larger
			return num1;
		} else {
			return num2; //if num2 is larger, or they are equal
		}
	}
	
	//takes two ints as parameters, returns the quotient and remainder
	public static String findQuotientAndRemainder(int num1, int num2){
		int largerNum, smallerNum; //declares two variables for future use
		
		//sets the bigger and smaller numbers to their respective variables
		largerNum = Math.max(num1,num2);
		smallerNum = Math.min(num1,num2);
		
		int quotient = largerNum / smallerNum; //calculates integer quotient
		int remainder = largerNum % smallerNum; //calculates integer remainder
		
		//returns a string of the quotient and remainder
		return (String)(quotient + "r. " + remainder); 
	}
	
	
	//determines if three sides make up a right triangle or not
	public static boolean isRightTriangle(int side1, int side2, int side3){
		
		//checks to see which side is the hypotenuse, then plugs the correct sides into the pythagorean theorem
		if (Math.max(Math.max(side1,side2),side3)==side1){ //if side1 = hypotenuse
			if (Math.pow(side1,2)==(Math.pow(side2,2) + Math.pow(side3,2))){ //if pythagorean theorem works
				return true;
			}
		} else if (Math.max(Math.max(side1,side2),side3)==side2){ //if side2 = hypotenuse
			if (Math.pow(side2,2)==(Math.pow(side1,2) + Math.pow(side3,2))){ //if pythagorean theorem works
				return true;
			}
		} else if (Math.max(Math.max(side1,side2),side3)==side3){ //if side3 = hypotenuse
			if (Math.pow(side3,2)==(Math.pow(side1,2) + Math.pow(side2,2))){ //if pythagorean theorem works
				return true;
		}
	}
		return false; //no case is a right triangle
}
	
	//determines the cost of a call to Virginia based on the length of the call
	public static String phoneCallCost(int minutes){
		//This method assumes that any length, 2 mins or less, is $1.15
		//It also assumes that all lengths of calls are positive
		
		//the cost of the first two minutes
		final int firstTwoMins = 115;
		
		//creates a variable to hold the cost of the call, initially the cost of the first two minutes
		//this variable is in CENTS
		int costInCents = firstTwoMins;
		
		//subtracts the two initial minutes from the given length of time
		minutes -= 2;
		
		if (minutes>0){ //only adds to cost if there are minutes left in the call
			//adds 50 cents per minute to costInCents
			costInCents += (minutes*50);
		}
		
		return (String)("$" + (costInCents/100.0));
	}
	
}
