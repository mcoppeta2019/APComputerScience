/*
 * 	Problem 1
 * 	Michael Coppeta
 * 
 * 	This program finds the first number whose sum of the digits preceding
 * 	it is greater than 100
 */

public class Problem1 {
	
	public static void main(String[] args){
		
		int n = 1, sum = 0; //initializes two variables to hold the number, and to hold the sum
		
		while (sum<=1000000){ //the sum must be greater than 1000000
			sum+=n; //it adds the current number to the sum
			n++; //increases n by 1
		}
		
		//prints the result to the user
		System.out.println("The number is " + (n-1));
	}
}
