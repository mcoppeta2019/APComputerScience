/*
 * 	Mike Coppeta
 * 	10/2/17
 *  Several projects using if statements
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
	}
	
	//determines which is larger and returns it
	public static int largestInt(int num1, int num2){
		if (num1>=num2) {
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
	
	//
	//determines if three sides make up a right triangle or not
	public static boolean isRightTriangle(int side1, int side2, int side3){
		
		if (Math.max(Math.max(side1,side2),side3)==side1){ //side1 = hypotenuse
			if (Math.pow(side1,2)==(Math.pow(side2,2) + Math.pow(side3,2))){ //pythagorean theorem is correct
				return true;
			}
		} else if (Math.max(Math.max(side1,side2),side3)==side2){ //side2 = hypotenuse
			if (Math.pow(side2,2)==(Math.pow(side1,2) + Math.pow(side3,2))){ //pythagorean theorem is correct
				return true;
			}
		} else if (Math.max(Math.max(side1,side2),side3)==side3){ //side3 = hypotenuse
			if (Math.pow(side3,2)==(Math.pow(side1,2) + Math.pow(side2,2))){ //pythagorean theorem is correct
				return true;
		}
		return false; //no case is a right triangle
	}
}
}
