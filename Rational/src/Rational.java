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
		
		int gcd = 1; //creates a gcd, =1 if no higher value
		
		for(int counter = newNumerator; counter > 1; counter--){//loops through possible gcd's
				
			if (newNumerator % counter == 0 &&
					newDenominator % counter == 0){ //if both ints are divisible by gcd
				gcd = counter;
				break;
				}
			}
			
			numerator = newNumerator / gcd; //sets the instances variables to the reduced amount
			denominator = newDenominator /gcd;
			
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
	
	//reciprocal function returns the recipricol of a rational
	public Rational reciprocal(){
		Rational r = new Rational(denominator, numerator);
		return r;
	}
	
	//equals method determines if two rationals are equal
	public boolean equals(Rational other){
		
		return (numerator == other.numerator && //return if numerator and denominator (already simplified) are equal
				denominator == other.denominator);
	}
	
	//finds the gcd of the given rational
	public int gcd(int newNumerator, int newDenominator){
		int gcd = 1; //creates a gcd, =1 if no higher value
		
		for(int counter = newNumerator; counter > 1; counter--){//loops through possible gcd's
				
			if (newNumerator % counter == 0 &&
					newDenominator % counter == 0){ //if both ints are divisible by gcd
				gcd = counter;
				break;
				}
			}
		
		return gcd; //returns the gcd
	}
	
	//reduces the rational fraction to its simplest form
	public void reduce(){
		int gcd = gcd(numerator, denominator); //finds gcd of rational
			
		numerator /= gcd; //sets the instances variables to the reduced amount
		denominator /= gcd;
		
	}
	
	//returns instance variables in a displayable format
	public String toString(){
		return numerator + "/" + denominator;
	}
}

