/*
 * 	Point Class
 * 	Michael Coppeta
 * 
 * 	Creates class file for Point
 */
public class Point {

	//Instance Variables
	double x, y;
	
	//CONSTRUCTORS
	
	//Default
	public Point(){
		this(0, 0); //sets instance variables equal to 0, the origin
	}
	
	//Given Points
	public Point(double newX, double newY){
		x = newX; //sets instance variables equal to the parameters of the constructor
		y = newY;
	}
	
	//Given a Point Object
	public Point(Point oldPoint){
		this(oldPoint.x, oldPoint.y); //sets instance variable equal to the instance variables of the given object
	}
	
	//ACCESSORS
	
	//Accessor for X 
	public double getX(){
		return x;
	}
	
	//Accessor for Y
	public double getY(){
		return y;
	}
	
	//MUTATORS
	
	//Mutator for X
	public void setX(double newX){
		x = newX;
	}
	
	//Mutator for Y
	public void setY(double newY){
		y = newY;
	}
	
	//BEHAVIORS
	
	//setLocation method, sets instance variables equal to the given pair
	public void setLocation(double newX, double newY){
		x = newX;
		y = newY;
	}
	
	//translate method, adjusts the point's x and y by the given amounts
	public void translate(double dx, double dy){
		x += dx;
		y += dy;
	}
	
	//distance method, returns the point's distance from the given point
	public double distance(Point p){
		return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2)); // (dx^2 + dy^2)^(1/2)
	}
	
	

}

