/*
 * 	Problem 5
 * 	Michael Coppeta
 * 	This program a series of lines with different patterns of asterisks
 */

public class Problem5 {
	public static void main(String[] args){
		//first two figures
		printTwoLines();
		printXFigure();
		
		//print blank line
		System.out.println();
		
		//print next three figures
		printTwoLines();
		printXFigure();
		printTwoLines();
		
		//print blank line then three lines of a single asterisk
		System.out.println("\n  *\n  *\n  *");
		
		//print last two figures
		printTwoLines();
		printXFigure();
	}
	
	//This method prints two lines of asterisks
	public static void printTwoLines(){
		System.out.println("*****\n*****");
	}
	
	//This method prints the 'x' figure of asterisks
	public static void printXFigure(){
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
}
