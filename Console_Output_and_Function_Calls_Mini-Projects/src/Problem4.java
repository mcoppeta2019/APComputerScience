/*
 * 	Problem 4
 * 	Michael Coppeta
 * 	This program prints another text image
 */
public class Problem4 {
	
	//This method calls other methods to create the image
	public static void main(String[] args){
		printTriangle();
		printSquare();
		printText();
		printSquare();
		printTriangle();
	}
	
	//This method prints an image of a triangle without a base
	public static void printTriangle(){
		System.out.println("   /\\   "); // "\\" for single backslash
		System.out.println("  /  \\  ");
		System.out.println(" /    \\ ");
	}
	
	//This method prints an image of a square
	public static void printSquare(){
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	
	//This method prints the section of the image with text
	public static void printText(){
		System.out.println("|Hello |");
		System.out.println("| World|");
	}
}
