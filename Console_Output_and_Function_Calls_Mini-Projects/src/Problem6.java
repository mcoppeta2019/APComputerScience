/*
 * 	Problem 6
 * 	Michael Coppeta
 * 	This program prints a more intricate design of asterisks and vertical lines
 */

public class Problem6 {
	
	//Calls methods to print the desired pattern
	public static void main(String[] args){
		printThreeLines(); //first three lines
		System.out.println(); //blank line
		
		printThreeLines();	//second pattern
		printSingleLine();
		System.out.println("*************"); //line of 13 asterisks
		printThreeLines();
		System.out.println(); //blank line
		
		printThreeLines(); //print three lines
		System.out.println("    *****    "); //single line of four asterisks
		printSingleLine(); //two single lines
		printSingleLine();
		System.out.println("    *****    \n    *****    "); //two lines of four asterisks
	}
	
	//Prints three lines, each increasing in the number of asterisks
	public static void printThreeLines(){
		System.out.println("    *****    ");
		System.out.println("  *********  ");
		System.out.println("*************");
	}
	 //Prints a single line of asterisks and vertical lines
	public static void printSingleLine(){
		System.out.println("* | | | | | *");
	}
}
