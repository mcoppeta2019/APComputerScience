//	Problem 1
// 	Michael Coppeta
//	This program is used to swap two elements in a given array

import java.util.Arrays; //imports the Arrays class

public class Problem1 {
	
	//calls the swap method
	public static void main(String[] args) {
		
		//testing
		int[] a1 = {12, 34, 56}; //test array
		int[] a2 = {0,8,2,3,4,5,6,7,1,9};
		swap(a1, 1, 2); //swaps second and third element
		System.out.println(Arrays.toString(a1)); //prints result: [12, 56, 34]
		
		swap(a1, 0, 2);
		System.out.println(Arrays.toString(a1)); // [34, 56, 12]
		swap(a2, 1, 8);
		System.out.println(Arrays.toString(a2)); //1-9
		
		swap(a1, -5, 1); //invalid parameters
		swap(a1, 2, 3);

	}
	
	//swaps the two given indices in the array given in the parameter
	public static void swap(int[] arr, int index1, int index2) {
		int temp; //declares variable to hold a temporary element
		
		//checks to make sure the index parameters are valid
		if (index1 >= 0 && index1 < arr.length &&
			index2 >= 0 && index2 < arr.length) {//both indices must be >=0 and less than arr.length
			
			temp = arr[index1]; //temp holds the element at the first index
			arr[index1] = arr[index2]; //first index takes value of second
			arr[index2] = temp; //second index takes value of temp (first index)
			
		} else { //if the parameters are invalid
			
			System.out.println("Invalid Indices"); //tell the user the indices are out of bounds
			
		}
	
	}
}
