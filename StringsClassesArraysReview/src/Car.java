//	Car Class
//	Michael Coppeta
//	This class is the blueprint for a Car object

public class Car {

	//INSTANCE VARIABLES
	private String make, model, color;
	private int year;
	
	//CONSTRUCTORS
	
	//default constructor, int=0, String=""
	public Car(){
		this(0,"","","");
	}
	
	
	//constructor with all information given
	public Car(int newYear, String newMake, String newModel, String newColor){
		year = newYear;
		make = newMake;
		model= newModel;
		color = newColor;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for year
	public int getYear(){
		return year;
	}
	
	//mutator for year
	public void setYear(int newYear){
		year = newYear;
	}
	
	//accessor for make
	public String getMake(){
		return make;
	}
	
	//mutator for make
	public void setMake(String newMake){
		make = newMake;
	}
	
	//accessor for model
	public String getModel(){
		return model;
	}
	
	//mutator for model
	public void setModel(String newModel){
		model = newModel;
	}
	
	//accessor for color
	public String getColor(){
		return color;
	}
	
	//mutator for color
	public void setColor(String newColor){
		color = newColor;
	}
	
	//BEHAVIORS
	
	//toString method returns instance variables in a string format
	public String toString(){
		return "" + year + " " + make + " " + model + " " + color;
	}
	
	//equals method determines if two Car objects are equal
	public boolean equals(Car other){
		return (toString().equals(other.toString())); //if their toStrings are equal
	}
	
}
