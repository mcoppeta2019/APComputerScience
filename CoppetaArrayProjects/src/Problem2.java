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
		
		//creates temporary int array to hold a1 values
		int[] temp = Arrays.copyOf(a1, a1.length);
		
		//loops through a2
		for (int i = 0; i < a2.length; i++) {
			a1[i] = a2[i]; //stores the a2 values in a1
		}
		
		//loops through temp
		for (int i = 0; i < temp.length; i++) {
			a2[i] = temp[i]; //stores the temp values (the original a1 valuels) in a2
		}
	}
}
