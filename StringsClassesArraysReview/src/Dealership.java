//	Dealership Class
// 	Michael Coppeta
// 	This class is the blueprint for the dealership object

import java.util.Arrays; //imports the Arrays class

public class Dealership {

	//INSTANCE VARIABLES
	
	private String name;
	private Car[] carArray;
	
	//CONSTRUCTORS
	
	//default
	public Dealership(){
		name = "";
		carArray = new Car[0];
	}
	
	//all values given
	public Dealership(String newName, Car[] newCarArray){
		name = newName;
		carArray = newCarArray;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for name
	public String getName(){
		return name;
	}
	
	//mutator for name
	public void setName(String newName){
		name = newName;
	}
	
	//accessor for carArray
	public Car[] getCarArray(){
		return carArray;
	}
	
	//mutator for carArray
	public void setCarArray(Car[] newCarArray){
		carArray = newCarArray;
	}
	
	//BEHAVIORS
	
	//toString method returns the instance variables as strings
	public String toString(){
		String toReturn = "" + name + "\n";
		
		for (Car a : carArray){ //adds each Car toString to the toString
			toReturn += a.toString() + "\n";
		}
		
		return toReturn;
	}
	
	//inStock method determines if the dealership has the specific car
	public boolean inStock(Car obj){
		
		for(Car a : carArray){ //loops through each Car in carArray
			if (a.toString().equals(obj.toString())){ //if the car is equal to on in carArray
				return true;
			}
		}
		return false; //return false if it had not shown up yet
	}
	
}
