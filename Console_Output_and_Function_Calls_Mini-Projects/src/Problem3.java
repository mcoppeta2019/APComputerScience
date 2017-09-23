/*
 * 	Problem 3
 * 	Michael Coppeta
 * 	This program prints a text image
 */

public class Problem3 {
	public static void main(String[] args){
		//prints the image
		printImage();
	}
	
	//series of functions to print the image
	public static void printImage(){
		printSlashes();
		printText();
		printText();
		printText();
		printText();
		printText();
	}
	
	//prints the line of slashes
	public static void printSlashes(){
		System.out.println("//////////////////////");
	}
	
	//prints a line of text, then a line of slashes
	public static void printText(){
		System.out.println("|| Victory is mine! ||");
		printSlashes(); //line of slashes
	}
}
