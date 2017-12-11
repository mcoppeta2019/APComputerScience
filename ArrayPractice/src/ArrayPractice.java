
public class ArrayPractice {
	public static void main(String[] args){
		
		//int array
		int[] nums = {0, 3, -2, 7, 4, 7, 6, 3, 2, 20, 25};
		
		/*print elements of array
		 
		for(int a : nums){
			System.out.print(a + " ");
		} 
		*/
		
		//prints elements of array
		for(int i =0; i<nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//prints elements backwards
		for(int i = nums.length - 1; i>=0; i--){
			System.out.print(nums[i] + " ");
		}
		
		//sum
		int sum = 0;
		for(int i : nums){
			sum += i;
		}
		System.out.println("\n\nsum is "+ sum);
		
		//is int in array
		System.out.println();
		int goal = 7;
		boolean inArray = false;
		
		for(int i : nums){
			if(i == goal){
				inArray = true;
				break;
			}
		}
		
		if (inArray){
			System.out.println(goal + " is in array");
		} else {
			System.out.println(goal + " is not in array");
		}
		
		//where is goal?
		System.out.println();
		if (inArray){
			for(int i = 0; i<nums.length; i++){
				if(nums[i] == goal){
					System.out.println(goal + " is at index " + i);
					break;
				}
			}
		} else {
			System.out.println(goal + "is not found");
		}
		
		//values greater than 18
		int greaterThan18 = 0;
		for(int i =0; i<nums.length; i++){
			if(nums[i] > 18){
				greaterThan18 += 1;
			}
		}
		System.out.println("\nThere are " + greaterThan18 + " elements greater than 18");
	}
}
