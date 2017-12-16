//	Problem 6
//	Michael Coppeta
//	This program returns an array of the counts of each vowel in a given string

import java.util.Arrays; //imports Arrays class

public class Problem6 {

	//main method for testing
	public static void main(String[] args) {
		
		//testing - copied from problem 6 description
		int[] a1 = vowelCount("I think, therefore I am");
		System.out.println(Arrays.toString(a1)); // [1, 3, 3, 1, 0]
		
		int[] a2 = vowelCount("I THINK, THEREFORE I AM");
		System.out.println(Arrays.toString(a2)); // [1, 3, 3, 1, 0]
		
	}
	
	//vowelCount method returns the array of the counts of each variable in a parameter string
	public static int[] vowelCount(String str) {
		
		char currentChar; //creates variable to hold the current char of the future loop
		int[] vowels = new int[5]; //creates array with 5 zeros to hold the vowel counts
		str = str.toLowerCase(); //prevents case errors, they are now all lowercase
		
		for (int i = 0; i<str.length(); i++) { //will loop through each char in the parameter string
			
			currentChar = str.charAt(i);
			
			if (currentChar == 'a') { //if the char is 'a', increment the a count by 1
				
				vowels[0]++;
				
			} else if (currentChar == 'e') { //if the char is 'e', increment the e count by 1
				
				vowels[1]++;
				
			} else if (currentChar == 'i') { //if the char is 'i', increment the i count by 1
				
				vowels[2]++;
				
			} else if (currentChar == 'o') { //if the char is 'o', increment the o count by 1
				
				vowels[3]++;
				
			} else if (currentChar == 'u') { //if the char is 'u', increment the u count by 1
				
				vowels[4]++;
				
			}
			
		}
		
		return vowels; //returns the integer array holding the vowel counts
		
	}
	
}
