/*
 * 	Regular Polygon Class
 * 	Michael Coppeta
 * 
 * 	Creates class file for RegularPoly
 */

public class RegularPoly {

	//INSTANCE VARIABLES
	private int numSides;
	private double sideLength;
	
	
	//CONSTRUCTORS
	
	//number of sides given 
	public RegularPoly(int sides){
		numSides = sides;
		sideLength = 1.0;
	}
	
	//both number of sides and side lengths given
	public RegularPoly(int sides, double length){
		numSides = sides;
		sideLength = length;
	}
	
	//ACCESSORS
	
	//accessor for number of sides
	public int getNumberOfSides(){
		return numSides;
	}
	
	//accessor for side length
	public double getSideLength(){
		return sideLength;
	}
	
	//MUTATORS
	
	//mutator for number of sides
	public void setNumberOfSides(int sides){
		numSides = sides;
	}
	
	//mutator for side length
	public void setSideLength(double length){
		sideLength = length;
	}
	
	//BEHAVIORS
	
	//to string method
	public String toString(){
		return ("numSides: " + numSides + "\nsideLength: " + sideLength);
	}
	
	//equals method
	public boolean equals(RegularPoly shape){
		return (numSides == shape.numSides && sideLength == shape.sideLength);
	}
}
