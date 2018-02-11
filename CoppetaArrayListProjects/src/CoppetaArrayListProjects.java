/*
 *	Coppeta Array List Projects
 *	Michael Coppeta
 *	Project uses the Lists and ArrayLists instead of standard arrays
 */

import java.util.*; //imports necessary classes

public class CoppetaArrayListProjects {

	//main method for testing the other methods
	public static void main(String[] args){
		
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
	
	//removeFigs method removes all instances of the word "Fig"
	public static void removeFigs(List<String> myList){
		for (int i=0; i<myList.size(); i++) { //loops through elements
			if(myList.get(i).toLowerCase().equals("fig")) { //if element is "fig", non case sensative
				myList.remove(i);
				i--;
			}
		}
	}
	
	//method replaces every word ending with an "s" with an 
	//uppercased and reversed version
	public static void capitalizeReversePlurals(List<String> myList){
		
		for(int i = 0; i < myList.size(); i++){
			String str = myList.get(i); //current element
			int len = str.length() - 1; //last index of the element
			String element = ""; //string to reverse the element if necessary
			
			if (str.charAt(len) == 's'){ //lowercase only, ends in "s"
				for(; len >= 0; len--){
					element += str.charAt(len); //loop reverses the string
				}
				myList.set(i, element.toUpperCase()); //sets the element to its uppercase version
			}
		}
	}
	
	//method removes all the Strings of even length from a given ArrayList
	public static void removeEvenLength(List<String> myList) {
		
		for (int i=0; i<myList.size(); i++) { //loops through elements
			if(myList.get(i).length() % 2 == 0) { //if element is of even length
				myList.remove(i); //removes it
				i--; //adjusts counter
			}
		}
	}
	
	//clump method combines strings into groups of two
	public static void clump(List<String> myList) {
		if(myList.size() >= 2) {
			for(int i=1; i<myList.size(); i++) {
				myList.set(i-1, "("+myList.get(i-1)+ " " +myList.get(i) + ")");
				myList.remove(i);
			}
		}
	}
	
	//intersect method returns an arraylist of the overlapping elements between two given lists
	public static List<Integer> intersect(List<Integer> list1, List<Integer> list2){
		List<Integer> toReturn = new ArrayList<Integer>(); //creates a list to return
		
		for(int i=0; i<list1.size(); i++) { //loops through first array
			if (list2.contains(list1.get(i)) && //checks if in both lists
					toReturn.contains(list1.get(i)) == false) { //prevents duplicates
				toReturn.add(list1.get(i)); //adds unique element to the return list
			}
		}
		
		return toReturn; //returns the list of overlapping elements
	}
	
	//reverse3 method reverses each successive sequence of three values
	public static void reverse3(List<Integer> myList) {
		
		if(myList.size() >= 3) { //if list has 3 or more elements
			
			for(int i=2; i<myList.size(); i+=3) { //loops by threes
				Integer temp = myList.get(i-2); //makes a temp variable to hold value at i
				myList.set(i-2, myList.get(i)); //sets i-2 to i
				myList.set(i, temp); //sets i to temp
			}
		}
	}
}
