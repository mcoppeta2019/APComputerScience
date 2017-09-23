/*
 * 	Problem 7
 * 	Michael Coppeta
 * 	This program prints a few lines of text
 */

public class Problem7 {
	public static void main(String[] args){
		//These lines each use different escape sequences to print the desired effects
		System.out.println("A \"quoted\" String is"); 
		
		/*
		 * The lines that are indented are not exactly the length of a tab in the problem's example output
		 * Therefore, I used five spaces to line them up "EXACTLY" as the example has it
		 * If they were the length of a tab, I would have written \t instead of five spaces
		*/
		
		System.out.println("     'much' better if you learn"); 
		System.out.println("the rules of \"escape sequences.\""); 
		System.out.println("     Also, \"\" represents an empty String.");
		System.out.println("Don't forget: use \\\" instead of \" !");
		System.out.println("     '' is not the same as \"");
	}
}
