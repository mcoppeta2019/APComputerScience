/*
 * 	Point Class
 * 	Michael Coppeta
 * 
 * 	Creates class file for Point
 */

public class Point {

	//Instance Variables
	private double x, y;
	
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
	
	//returns class instance variables in string form
	public String toString(){
		return ("(" + x + ", " + y + ")");
		//return ("X: " + x + "\nY: " + y);
	}
	
	//returns whether two points have the same state
	public boolean equals(Point p){
		return ((x == p.x) && (y == p.y));
	}
	
	//returns the quadrant the point is in
	public int quadrant(){
		if (x>0 && y>0){
			return 1;
		} else if (x>0 && y<0){
			return 4;
		} else if (x<0 && y<0){
			return 3;
		} else if (x<0 && y>0){
			return 2;
		} else {
			return 0;
		}
	}
	
	//returns if two points have the same x value
	public boolean isVertical(Point other){
		return (x==other.x);
	}

	//swaps x and y values and negates both
	public void flip(){
		double tempValue = x;
		x = y * -1;
		y = tempValue * -1;
	}
	
	//rotates the point around a given point
	public void rotate(double angle, int xCenter, int yCenter){
		x = (Math.cos(angle) * (x - xCenter)) - (Math.sin(angle) * (y - yCenter)) + xCenter;
		y = (Math.sin(angle) * (x - xCenter)) + (Math.cos(angle) * (y - yCenter)) + yCenter;
	}
	
	//retunrs manhattan distance between two points
	public double manhattanDistance(Point other){
		return (Math.abs(x-other.x) + Math.abs(y-other.y));
	}
	
	//returns slope between two points
	public double slope(Point other){
		return (other.y-y)/(other.x-x);
	}
	
	//returns whether three points are collinear
	public boolean isCollinear(Point p1, Point p2){
		return (slope(p1) - p1.slope(p2) <= 0.00001);
	}
}

