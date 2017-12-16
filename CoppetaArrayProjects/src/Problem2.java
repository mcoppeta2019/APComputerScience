//	Problem 2
// 	Michael Coppeta
// 	This program swaps the contents of two integer arrays

import java.util.Arrays; //imports the Arrays class

public class Problem2 {

	//main method for testing values
	public static void main(String[] args) {
		
		//testing -copied from problem description
		int[] a1 = {12, 34, 56};
		int[] a2 = {20, 50, 80};
		swapAll(a1, a2);
		System.out.println(Arrays.toString(a1)); //[20, 50, 80]
		System.out.println(Arrays.toString(a2)); //[12, 34, 56]
		
	}
	
	//this method swaps the contents of two arrays
	//assumes the two arrays are of the same length
	public static void swapAll(int[] a1, int[] a2) {
		
		int[] temp = Arrays.copyOf(a1, a1.length); //makes temp array which is a copy of a1
		
		//stores copy of a2 in a1
		a1 = Arrays.copyOf(a2, a2.length); 
		
		//stores copy of temp (a1) in a2
		a2 = Arrays.copyOf(temp, temp.length);
	
		/*
		 * FIX THIS
		 */
	}
}
