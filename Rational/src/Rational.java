/*
 * 	Rational Class
 * 	Michael Coppeta
 * 
 * 	This class models a rational number
 */

public class Rational {

	//INSTANCE VARIABLES
	private int numerator, denominator;
	
	//CONSTRUCTORS
	
	//given numerator and denominator
	public Rational(int newNumerator, int newDenominator){
		if(newNumerator % newDenominator == 0){ //if it is not simplified
			
			int gcd = 1;
			
			for(int counter = newNumerator; counter > 1; counter--){//loops through possible gcd's
				
				if (newNumerator % counter == 0 &&
						newDenominator % counter == 0){ //if both ints are divisible by gcd
					gcd = counter;
					break;
				}
			}
			
			numerator = newNumerator / gcd; //sets the instances variables to the reduced amount
			denominator = newDenominator /gcd;
			
		} else { //already simplified
			numerator = newNumerator;
			denominator = newDenominator;
		}
	}
	
	//given a numerator to represent a whole number
	public Rational(int newNumerator){
		numerator = newNumerator;
		denominator = 1;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for numerator
	public int getNumerator(){
		return numerator;
	}
	
	//mutator for numerator
	public void setNumerator(int newNumerator){
		numerator = newNumerator;
	}
	
	//accessor for denominator
	public int getDenominator(){
		return denominator;
	}
	
	//mutator for denominator
	public void setDenominator(int newDenominator){
		denominator = newDenominator;
	}
	
	//BEHAVIORS
	
	public String toString(){
		return numerator + "/" + denominator;
	}
}
