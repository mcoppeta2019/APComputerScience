//	Problem 7
// 	Michael Coppeta
//	This program stretches a given integer array

import java.util.Arrays; //imports the Arrays class

public class Problem7 {

	//main method for testing
	public static void main(String[] args) {
		
		//testing - copied from problem 7 description
		int[] list = {18, 7, 4, 24, 11};
		int[] a1 = stretch(list);
		System.out.println(Arrays.toString(a1)); // [9, 9, 4, 3, 2, 2, 12, 12, 6, 5]
		
	}
	
	//the stretch method returns a new array, double the length, with each element a pair of 1/2 its original value\
	public static int[] stretch(int[] a1) {
		int[] toReturn = new int[a1.length * 2]; //creates new int array of double the length of parameter
		
		for (int i = 0; i < a1.length; i++) { //loops through a1
			
			if (a1[i] % 2 == 0) {//if value is even
				
				toReturn[i*2] = a1[i] / 2; //index i*2 = 1/2 a1's value
				toReturn[(i*2) + 1] = a1[i] / 2; //index i*2+! = 1/2 a1's value
				
			} else { //if value is odd
				
				toReturn[i*2] = a1[i] / 2 + 1; //index i*2 = 1/2 a1's value + 1
				toReturn[(i*2) + 1] = a1[i] / 2; //index i*2+1 = 1/2 a1's value (rounds down)
				
			}
		
		}
		
		return toReturn; //returns the new, stretched array
	}
}
