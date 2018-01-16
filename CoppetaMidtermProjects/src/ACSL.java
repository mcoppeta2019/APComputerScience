//	ACSL.java
//	Michael Coppeta
//
//	This program forms the plural and suffixes to given words, where A, S, C, and L are the vowels,
//	And different grammar rules are followed. 

import java.util.Scanner; //imports the scanner

//NOTE: All input is assumed to be entered correctly:
//	word lengths >= 1, all upper case)
public class ACSL {

	//main method takes input and runs the rest of the program
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //instantiates the scanner
		String word, suffix; //declares variables for the input values
		
		//prompts the user for input, and stores in corresponding variables
		System.out.print("Word: ");
		word = input.nextLine().toUpperCase();
		System.out.print("Suffix: ");
		suffix = input.nextLine().toUpperCase();
		
		input.close(); //closes scanner object
		
		//calls method to form plural and suffix correctly
		formWords(word, suffix);
	}
	
	//this method manipulates the word and suffix to print correct plural and suffix
	//takes in the word and suffix, and outputs the two formed words
	public static void formWords(String word, String suffix) {
		String[] vowels = {"A", "C", "S", "L"}; //String array to hold vowel characters
		
		//booleans to determine if last and second to last character of WORD are vowels or not
		boolean lastIsVowel;
		boolean secondLastIsVowel = false; //gets initial value to avoid errors 
		
		boolean suffixFirstIsVowel; //boolean to determine is first char of suffix is vowel or not
		
		//sets values to the boolean variables
		lastIsVowel = arrayContains(vowels, ""+word.charAt(word.length()-1)); //true if last char is vowel
		
		if (word.length() >= 2) { //if there is a second to last character
			//true if second to last char is vowel
			secondLastIsVowel = arrayContains(vowels, ""+word.charAt(word.length()-2)); 
		}
		
		suffixFirstIsVowel = arrayContains(vowels, ""+suffix.charAt(0));
		
		//forms words and displays depending on grammar rules
		//tests for all cases, starting with the last letter(s) of the string
		
		//if the two last letters are both vowels or both consonants
		if(word.length() >=2 && lastIsVowel == secondLastIsVowel) {
			
				System.out.print("\nPlural of " + word + ": ");
				//doubles last letter and adds an H
				System.out.println(""+ word + word.charAt(word.length()-1)+"H"); 
				
				//determines suffix output
				System.out.print("Word with Suffix: ");
				if (suffixFirstIsVowel) {//if suffix starts with vowel
					
					System.out.println("" + word + suffix.charAt(0) + suffix);
					
				} else { //if suffix starts with a consonant
					
					String retWord = dropChain(word, vowels); //calls method to return the correct string to print
					System.out.println("" + retWord + suffix);
				}
				
		} else if (lastIsVowel) { //case when word ends in single vowel
			
			System.out.print("\nPlural of " + word + ": ");
			//replaces the final vowel (always last letter) with the letter G
			System.out.println(word.substring(0, word.length()-1) + "G");
			
			//determines suffix output
			System.out.print("Word with Suffix: ");
			if (suffixFirstIsVowel) {//if suffix starts with vowel
				
				suffix+= " ";
				System.out.println("" + word + suffix.substring(1));
				
			} else { //if suffix starts with a consonant
		
				System.out.println("" + word + suffix.charAt(0) + suffix);
			}
		
		} else { //only other case is if word ends in single consonant
			
			System.out.print("\nPlural of " + word + ": ");
			//adds GH to the end of the word
			System.out.println("" + word + "GH");
			
			//determines suffix output
			System.out.print("Word with Suffix: ");
			if(suffixFirstIsVowel) { //if suffix starts with vowel
				
				System.out.println(word + suffix);
				
			} else { //if suffix starts with consonant
				
				System.out.println(word + suffix);
			}
		}
	}
	
	//this method returns whether or not a given array contains a given value
	//takes an array, and a desired value, returns a boolean
	public static boolean arrayContains(String[] array, String value) {
		
		for (String str : array) { //loops through array values
			if (str.equals(value)) { //if an array element equals the desired value
				return true;
			}
		}
		
		return false; //if it is not found in the array
	}
	
	//this method returns the parameter but with the leftmost letter of the 
	//	final sequence of vowels or consonants in the parameter
	//takes in a string, and an array (to send to another method), and returns a modified string
	public static String dropChain(String str, String[] vowels){
		int i = str.length()-1; //counter
		
		//loops backwards through str to find where two consecutive chars are not both vowels or consonants
		for(; i>0; i--){ 
			if(arrayContains(vowels, ""+str.charAt(i)) != arrayContains(vowels, ""+str.charAt(i-1))) {
				break;
			}
		} //at this point, i is the index when str.charAt(i) != str.charAt(i-1), vowel-wise
		
		String toReturn = "";
		toReturn += str.substring(0, i); //everything up to leftmost of final sequence
		if (str.length() > i+1) { //if there is anothor char after str.charAt(i)
			toReturn += str.substring(i+1);
		}
		
		return toReturn; //returns string
		
	}
}
