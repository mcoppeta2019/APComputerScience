//	Problem 4
// 	Michael Coppeta
// 	This program counts how many elements in an integer array fall between the specified min and max values

public class Problem4 {
	
	//main method to test values
	public static void main(String[] args) {
		
		//testing - copied from problem 4 description
		int[] a1 = {14, 1, 22, 17, 36, 7, -43, 5};
		System.out.println(countInRange(a1, 4, 17)); //should be 4
	
	}
	
	//countInRange method determines the number of elements in an array between tha parameter boundaries
	public static int countInRange(int[] a1, int min, int max) {
		int counter = 0; //creates variable to hold count to return
		
		for (int i = 0; i < a1.length; i++) { //loops through each element
			
			if (a1[i] >= min && a1[i] <= max) { //if element falls between boundaries
				counter++; //increments the counter
			}
		}
		
		return counter; //returns the number of elements that satisfy the problem
	}
}
