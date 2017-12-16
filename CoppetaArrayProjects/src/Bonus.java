// 	Bonus Problem
//	Michael Coppeta
// 	This program removes duplicates from an array of strings

import java.util.Arrays; //imports Arrays class

public class Bonus {

	//main method for testing
	public static void main(String[] args) {
		
		String[] values = {"A", "C", "C", "B", "A", "C", "B", "B", "A"};
		String[] newList = removeDuplicates(values);
		System.out.println(Arrays.toString(newList)); // [A, C, B]
		
	}
	
	//this method removes duplicates from a String array parameter
	public static String[] removeDuplicates(String[] values) {
		
		int toReturnIndex = 0; //the current index of the toReturn array
		String[] toReturn; //declares an array that will later be returned
		String[] currentArray = new String[values.length]; //creates a new array for non-duplicates
		int uniqueElements; //declares variable to hold the number of unique elements in currentArray
		
		for (int i = 0; i < values.length; i++) { //loops through values array
			
			if (! arrayHas(currentArray, values[i])) { //if the currentArray array does not have the values[i] element
				
				currentArray[i] = values[i]; //puts the unique string in the currentArray array
				
			}
		}
		
		uniqueElements = countUniques(currentArray); //determines the number of unique elements in currentArray
		toReturn = new String[uniqueElements]; //sets the size of the toReturn array
		
		
		for (int i = 0; i < currentArray.length; i++) { //loops through currentArray (all unique)
			
			if (currentArray[i] != null) { //if the element is not the default value, add it to toReturn
				
				toReturn[toReturnIndex] = currentArray[i]; //adds unique element to toReturn
				toReturnIndex++; //moves to next index of toReturn array
			}
		}
		
		return toReturn; //returns the new array only containing unique elements
	}
	
	//this method determines if a given array contains a given value
	public static boolean arrayHas(String[] arr, String value) {
		
		for (int i = 0; i < arr.length; i++) { //loops through arr array
			
			if (arr[i] != null && arr[i].equals(value)) { //if the array value equals the parameter value, return true
				return true;
			}
		}
		
		return false; //the value is not in the array
	}
	
	//this method returns the number of unique elements in a given array
	public static int countUniques(String[] arr) {
		int uniques = 0; //initial number of unique elements
		
		for (int i = 0; i < arr.length; i++) { //loops through parameter array
			
			if (arr[i] != null) { //if arr[i] is not null, the default string array value
				
				uniques++; //increments the unique element counter by 1
			}
		}
		
		return uniques; //returns the number of unique elements
	}
}
