/*
 *	Coppeta Array List Projects
 *	Michael Coppeta
 *	Project uses the Lists and ArrayLists instead of standard arrays
 */

import java.util.*; //imports necessary classes

public class CoppetaArrayListProjects {

	//main method for testing the other methods
	public static void main(String[] args){
		List<String> myList = new ArrayList<String>();
		myList.add("thomas"); myList.add("cat"); myList.add("cats");
		myList.add("dog"); myList.add("dogs"); myList.add("f");
		
		//test addStars
		addStars(myList);
		System.out.println(Arrays.toString(myList.toArray()));
		
		//test removeStars
		removeStars(myList);
		System.out.println(Arrays.toString(myList.toArray()));
		
		//test reverseList
		reverseList(myList);
		System.out.println(Arrays.toString(myList.toArray()));
		
		//tests *****
		
		//tests capitalize... method
		capitalizeReversePlurals(myList);
		System.out.println(Arrays.toString(myList.toArray()));
	}
	
	//addStars method takes an ArrayList of strings and adds a "*" after each element
	public static void addStars(List<String> myList){
		for(int i = 0; i < myList.size(); i += 2){ //loops through elements
			myList.add(i+1, "*"); //adds "*" to next index
		}
	}
	
	//removeStars method removes every other element, reverse of addStars
	//assumes that every other element is a "*" because addStars was called
	public static void removeStars(List<String> myList){
		for(int i = 1; i < myList.size(); i++){ //loops through elements
			myList.remove(i); //removes every other
		}
	}
	
	//reverseList method reverses the order of elements in an ArrayList
	public static void reverseList(List<String> myList){
		String[] temp = new String[myList.size()]; //creates array to hold myList values
		int i = myList.size() -1; //creates counter starting at last index
		
		for(String str : myList){ //loops through each element
			temp[i] = str; //stores in temp from last to first index
			i--; //reduces counter
		}
		
		for(i = 0; i<myList.size(); i++){ //loops through temp array
			myList.set(i, temp[i]); //sets values in myList first to last index
		}
	}
	
	//removeFigs method removes all instances of the word "fig"
	public static void removeFigs(List<String> myList){
		/*
		 * DO THIS METHOD
		 */
	}
	
	//method replaces every word ending with an "S" with an 
	//uppercased and reversed version
	public static void capitalizeReversePlurals(List<String> myList){
		
		for(int i = 0; i < myList.size(); i++){
			String str = myList.get(i);
			char[] temp = new char[str.length() - 1];
			int len = str.length() -1;
			if (str.toLowerCase().charAt(len) == 's'){
				for(int j = 0; j < str.length(); j++){
					temp[j] = str.charAt(j); //THERE IS A PROBLEM HERE
				}
				str = "";
				for(int j = len; j>=0; j--){
					str += (""+temp[j]).toUpperCase();
				}
				myList.set(i, str);
			}
		}
	}
	
}
