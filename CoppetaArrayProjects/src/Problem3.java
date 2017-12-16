// 	Problem 3
//	Michael Coppeta
//	This program merges two arrays into one new array

import java.util.Arrays; //imports the Arrays class

public class Problem3 {

	//main method to test values
	public static void main(String[] args) {
		
		//testing - copied from problem3.java description
		int[] a1 = {12, 34, 56};
		int[] a2 = {7,8,9,10};
		int[] a3 = merge(a1, a2);
		System.out.println(Arrays.toString(a3)); //[12, 34, 56, 7, 8, 9, 10]
		
	}
	
	//this method merges the two parameter arrays together and returns new array
	public static int[] merge(int[] a1, int[] a2) {
		
		int[] toReturn = new int[a1.length + a2.length]; //creates an empty array of the correct length
		
		//puts the elements of a1 into toReturn first
		for (int i = 0; i<a1.length; i++) {
			toReturn[i] = a1[i];
		}
		
		//puts the elements of a2 into toReturn following the a1 elements
		for (int i = 0; i<a2.length; i++) {
			toReturn[i + a1.length] = a2[i];
		}
		
		return toReturn; //returns merged integer array
	}
}
