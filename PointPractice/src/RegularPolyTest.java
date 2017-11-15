/*
 * 	Regular Polygon Test
 * 	Michael Coppeta
 * 
 * 	Tests the RegularPoly class
 */


public class RegularPolyTest {
	
	//method for testing
	public static void main(String[] args){
		
	//tests constructors
	RegularPoly shape1 = new RegularPoly(4);
	RegularPoly shape2 = new RegularPoly(8, 4);
	
	//tests toString methods
	System.out.println("toString of Constructors \nshape1: " + 
			shape1 + "\nshape2: " + shape2); //4, 1 | 8, 4
	
	//tests accessors and mutators
	System.out.println("Accessors:\nshape1 numSides: " + 
			shape1.getNumberOfSides() + "\nshape1 sideLength: " + 
			shape1.getSideLength()); //4, 1
	shape2.setNumberOfSides(5);
	shape2.setSideLength(40);
	System.out.println("\nMutators: \nshape2 numSides (5): " + 
			shape2.getNumberOfSides() + "\nshape2 sideLength (40): " + 
			shape2.getSideLength()); //5, 40
	
	//tests equals
	System.out.println(shape1.equals(shape2)); //false
	
	shape2.setNumberOfSides(4);
	shape2.setSideLength(1);
	
	System.out.println(shape1.equals(shape2)); //true
	}
}
