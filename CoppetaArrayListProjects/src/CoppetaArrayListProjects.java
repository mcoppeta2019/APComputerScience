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
		myList.add("a"); myList.add("b");
		addStars(myList);
		System.out.println(Arrays.toString(myList.toArray()));
	}
	
	//addStars method takes an ArrayList of strings and adds a "*" after each element
	public static void addStars(List<String> myList){
		for(int i = 0; i < myList.size(); i += 2){
			myList.add(i+1, "*");
		}
	}
	
}
