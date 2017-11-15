/*
 * 	Circle Class
 * 	Michael Coppeta
 * 
 * 	Creates class file for Circle
 */

public class Circle {

	//Instance Variables
	private double radius;
	private Point center = new Point();
	
	//CONSTRUCTORS
	
	//Default
	public Circle(){
		radius = 1.0;
		center.setLocation(0, 0);
	}
	
	//Just radius given
	public Circle(double newRadius){
		radius = newRadius;
		center.setLocation(0, 0);
	}
	
	//Just center given
	public Circle(Point p){
		radius = 1;
		center.setLocation(p.getX(), p.getY());
	}
	
	//Both radius and center given
	public Circle(double newRadius, Point newCenter){
		radius = newRadius;
		center.setLocation(newCenter.getX(), newCenter.getY());
	}
	
	//ACCESSORS
	
	//Accessor for radius
	public double getRadius(){
		return radius;
	}
	
	//Accessor for center
	public Point getCenter(){
		return center;
	}
	
	//MUTATORS
	
	//Mutator for radius
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	//Mutator for center point
	public void setCenter(Point p){
		center.setLocation(p.getX(), p.getY());
	}
	
	//BEHAVIORS
	
	//inCircle method, determines if point is within circle
	public boolean inCircle(Point p){
		return (center.distance(p) <= radius);
	}
	
	//toString method, returns the instance variables as a string
	public String toString(){
		return ("Radius " + radius + "\n" + center.toString());
	}
}
