/*
 * 	Problem 1
 * 	Michael Coppeta
 * 
 * 	This program finds the first number whose sum of the digits preceding
 * 	it is greater than 100
 */

public class Problem1 {
	public static void main(String[] args){
		int n = 1, sum = 0;
		
		while (sum<=1000000){
			sum+=n;
			n++;
		}
		
		System.out.println("The number is " + (n-1));
	}
}
