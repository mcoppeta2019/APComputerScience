//	Problem 5
//	Michael Coppeta
// 	This program 

public class Problem5 {

	//main method for testing values
	public static void main(String[] args) {
		
		//testing - copied from problem 5 description
		int[] a1 = {1, 3, 7, 6, 12};
		System.out.println(minGap(a1)); //1
		
	}
	
	//minGap method returns the smallest gap between to consecutive integers in an array
	public static int minGap(int[] a1) {
		int smallestGap, currentGap; //declares variable to hold smallest and current gap between elements
		
		if (a1.length <= 2) { //if there are less than or equal to two elements, return 0
			return 0;
		}
		
		smallestGap = Math.max(a1[1], a1[0]) - Math.min(a1[1], a1[0]);
		
		for (int i = 1; i < a1.length; i++) { //loops through each element
			
			//subtracts smallest value from largest value of two consecutive elements, stores in currentGap
			currentGap = Math.max(a1[i-1], a1[i]) - Math.min(a1[i-1], a1[i]); 
			
			if (currentGap < smallestGap) {
				smallestGap = currentGap; //if currentGap is smaller than the smallest, it becomes the smallest
			}
			
		}
		
		return smallestGap; //returns the smallest gap between consecutive elements of given array
	}
	
}
